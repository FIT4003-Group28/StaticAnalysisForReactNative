package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zxe  reason: default package */
/* loaded from: classes7.dex */
public final class zxe extends LinearLayout {
    public static final cqkv a = new zxf();
    private final Rect b;
    private boolean c;

    public zxe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        View findViewById = findViewById(R.id.waypoint_row_waypoint_field);
        View findViewById2 = findViewById(R.id.waypoint_row_grabber);
        View findViewById3 = findViewById(R.id.waypoint_row_waypoint_text);
        View findViewById4 = findViewById(R.id.waypoint_row_remove_waypoint);
        this.b.set(findViewById.getLeft() + findViewById3.getLeft(), 0, findViewById.getLeft() + findViewById3.getRight(), getHeight());
        if (od.s(this) != 0 ? motionEvent.getX() >= this.b.right || motionEvent.getX() <= findViewById.getLeft() : motionEvent.getX() <= this.b.left || motionEvent.getX() >= findViewById.getRight()) {
            if (od.s(this) != 0 ? motionEvent.getX() > this.b.right : motionEvent.getX() < this.b.left) {
                if (this.c) {
                    return findViewById2.onTouchEvent(motionEvent);
                }
            }
            if (findViewById4.getVisibility() != 0 || (od.s(this) != 0 ? motionEvent.getX() >= findViewById.getLeft() : motionEvent.getX() <= findViewById.getRight())) {
                return false;
            }
            return findViewById4.onTouchEvent(motionEvent);
        }
        return findViewById.onTouchEvent(motionEvent);
    }

    public void setIsReorderable(boolean z) {
        this.c = z;
    }
}
