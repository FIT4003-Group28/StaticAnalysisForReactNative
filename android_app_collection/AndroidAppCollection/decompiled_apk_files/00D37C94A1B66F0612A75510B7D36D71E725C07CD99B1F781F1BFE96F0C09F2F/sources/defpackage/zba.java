package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: zba  reason: default package */
/* loaded from: classes4.dex */
public class zba extends ViewPager {
    private final zaz i;
    private final zaz j;

    public zba(Context context) {
        super(context);
        this.i = new zay(this, 1);
        this.j = new zay(this);
    }

    private static final boolean w(MotionEvent motionEvent, zaz zazVar) {
        try {
            return zazVar.a(motionEvent);
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            return false;
        }
    }

    public final /* synthetic */ boolean A(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return w(motionEvent, this.j);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return w(motionEvent, this.i);
    }

    public final /* synthetic */ boolean z(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public zba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new zay(this, 1);
        this.j = new zay(this);
    }
}
