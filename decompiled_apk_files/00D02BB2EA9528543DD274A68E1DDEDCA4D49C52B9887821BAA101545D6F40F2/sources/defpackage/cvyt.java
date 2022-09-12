package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvyt  reason: default package */
/* loaded from: classes.dex */
public final class cvyt<T> implements View.OnTouchListener {
    public final cvze<T> a;
    public final SelectedAccountDisc<T> b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final ni e;

    public cvyt(cvze<T> cvzeVar, SelectedAccountDisc<T> selectedAccountDisc) {
        cvyq cvyqVar = new cvyq(this);
        this.d = cvyqVar;
        this.a = cvzeVar;
        this.b = selectedAccountDisc;
        ni niVar = new ni(selectedAccountDisc.getContext(), cvyqVar);
        this.e = niVar;
        niVar.b(true);
    }

    public static <T> T b(List<T> list, T t, int i) {
        int size;
        if (list.isEmpty()) {
            return t;
        }
        int i2 = i + (-1) != 2 ? -1 : 1;
        int indexOf = list.indexOf(t);
        return (indexOf == -1 || (size = ((i2 + indexOf) + list.size()) % list.size()) == indexOf) ? t : list.get(size);
    }

    public final boolean a(T t, T t2) {
        String b;
        String b2;
        this.a.o();
        b = ((cwfm) t).b();
        b2 = ((cwfm) t2).b();
        return b.equals(b2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dbsk.m(view == this.b, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            this.b.requestDisallowInterceptTouchEvent(true);
        }
        return this.e.a(motionEvent);
    }
}
