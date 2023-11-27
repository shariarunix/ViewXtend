package com.shariarunix.viewxtend;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class GridXtend extends GridView {

    private boolean isXtend = false;

    public GridXtend(Context context) {
        super(context);
    }

    public GridXtend(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridXtend(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public GridXtend(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
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
