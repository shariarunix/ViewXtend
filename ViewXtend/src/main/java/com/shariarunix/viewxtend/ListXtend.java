package com.shariarunix.viewxtend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ListXtend extends ListView {

    private boolean isXtend = false;

    public ListXtend(Context context) {
        super(context);
    }

    public ListXtend(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListXtend(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ListXtend(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public boolean isXtend() {
        return isXtend;
    }

    public void setXtend(boolean xtend) {
        isXtend = xtend;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (isXtend()) {
            int newHeightMeasureSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, newHeightMeasureSpec);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
