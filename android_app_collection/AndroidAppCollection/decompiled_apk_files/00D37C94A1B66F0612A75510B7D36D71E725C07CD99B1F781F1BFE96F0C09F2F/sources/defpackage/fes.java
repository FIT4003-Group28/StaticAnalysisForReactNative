package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fes  reason: default package */
/* loaded from: classes3.dex */
public final class fes implements zbs, zbo {
    private final View a;
    private Point b;

    public fes(View view) {
        this.a = view;
    }

    private final Point d(MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = new Point();
        }
        this.b.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        ezv.n(this.b, this.a);
        return this.b;
    }

    @Override // defpackage.zbs
    public final void b(MotionEvent motionEvent) {
        View k = ezv.k(this.a, d(motionEvent), ejw.p);
        if (k == null) {
            return;
        }
        if (k.getTag(R.id.player_overlay_tap_listener) != null) {
            ((zbs) k.getTag(R.id.player_overlay_tap_listener)).b(motionEvent);
        } else if (!k.isClickable()) {
        } else {
            k.performClick();
        }
    }

    @Override // defpackage.zbo
    public final void nM(MotionEvent motionEvent, boolean z) {
        View k = ezv.k(this.a, d(motionEvent), ejw.o);
        if (k == null) {
            return;
        }
        ((zbo) k.getTag(R.id.player_overlay_tap_listener)).nM(motionEvent, z);
    }

    @Override // defpackage.zbo
    public final boolean nQ(MotionEvent motionEvent, boolean z) {
        View k = ezv.k(this.a, d(motionEvent), ejw.n);
        if (k == null) {
            return false;
        }
        return ((zbo) k.getTag(R.id.player_overlay_tap_listener)).nQ(motionEvent, z);
    }
}
