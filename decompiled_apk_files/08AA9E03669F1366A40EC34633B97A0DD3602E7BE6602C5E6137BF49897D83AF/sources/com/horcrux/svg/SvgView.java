package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class SvgView extends View {
    private Bitmap mBitmap;
    private final com.facebook.react.uimanager.events.c mEventDispatcher;
    private long mGestureStartTime;
    private int mTargetTag;
    private final com.facebook.react.uimanager.events.g mTouchEventCoalescingKeyHelper;

    /* loaded from: classes.dex */
    public enum Events {
        EVENT_DATA_URL("onDataURL");
        
        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(com.facebook.react.bridge.aj ajVar) {
        super(ajVar);
        this.mGestureStartTime = Long.MIN_VALUE;
        this.mTouchEventCoalescingKeyHelper = new com.facebook.react.uimanager.events.g();
        this.mEventDispatcher = ((UIManagerModule) ajVar.b(UIManagerModule.class)).getEventDispatcher();
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        SvgViewManager.setSvgView(this);
    }

    public void setBitmap(Bitmap bitmap) {
        if (this.mBitmap != null) {
            this.mBitmap.recycle();
        }
        this.mBitmap = bitmap;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mBitmap != null) {
            canvas.drawBitmap(this.mBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
    }

    private SvgViewShadowNode getShadowNode() {
        return SvgViewManager.getShadowNodeByTag(getId());
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.mTargetTag = getShadowNode().hitTest(new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
        if (this.mTargetTag != -1) {
            handleTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private int getAbsoluteLeft(View view) {
        int left = view.getLeft() - view.getScrollX();
        return (view.getParent() == view.getRootView() || (view.getParent() instanceof com.facebook.react.p)) ? left : left + getAbsoluteLeft((View) view.getParent());
    }

    private int getAbsoluteTop(View view) {
        int top = view.getTop() - view.getScrollY();
        return (view.getParent() == view.getRootView() || (view.getParent() instanceof com.facebook.react.p)) ? top : top + getAbsoluteTop((View) view.getParent());
    }

    private void dispatch(MotionEvent motionEvent, com.facebook.react.uimanager.events.h hVar) {
        motionEvent.offsetLocation(getAbsoluteLeft(this), getAbsoluteTop(this));
        this.mEventDispatcher.a(com.facebook.react.uimanager.events.f.a(this.mTargetTag, hVar, motionEvent, this.mGestureStartTime, motionEvent.getX(), motionEvent.getY(), this.mTouchEventCoalescingKeyHelper));
    }

    private void handleTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mGestureStartTime = motionEvent.getEventTime();
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.START);
        } else if (this.mTargetTag == -1) {
            Log.e("error", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
        } else if (action == 1) {
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.END);
            this.mTargetTag = -1;
            this.mGestureStartTime = Long.MIN_VALUE;
        } else if (action == 2) {
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.MOVE);
        } else if (action == 5) {
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.START);
        } else if (action == 6) {
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.END);
        } else if (action == 3) {
            dispatchCancelEvent(motionEvent);
            this.mTargetTag = -1;
            this.mGestureStartTime = Long.MIN_VALUE;
        } else {
            Log.w("IGNORE", "Warning : touch event was ignored. Action=" + action + " Target=" + this.mTargetTag);
        }
    }

    private void dispatchCancelEvent(MotionEvent motionEvent) {
        if (this.mTargetTag == -1) {
            Log.w("error", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
        } else {
            dispatch(motionEvent, com.facebook.react.uimanager.events.h.CANCEL);
        }
    }
}
