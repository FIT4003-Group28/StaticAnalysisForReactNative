package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: ssh  reason: default package */
/* loaded from: classes4.dex */
public final class ssh implements tct {
    private final /* synthetic */ int a;

    public ssh() {
    }

    public ssh(int i) {
        this.a = i;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.tct
    public final aooq a() {
        if (this.a == 0) {
            return asvr.b;
        }
        return awqc.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, final tcs tcsVar) {
        int i = 1;
        if (this.a == 0) {
            final asvr asvrVar = (asvr) obj;
            int i2 = asvrVar.c;
            if ((i2 & 2) == 0 || (i2 & 1) == 0) {
                return aynr.f();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                int c = aqvb.c(asvrVar.d);
                if (c != 0) {
                    i = c;
                }
                ajjh.e(i, asvrVar.e, tcsVar);
                return aynr.f();
            }
            return aynr.t(new aypv() { // from class: ssg
                @Override // defpackage.aypv
                public final void a() {
                    asvr asvrVar2 = asvr.this;
                    tcs tcsVar2 = tcsVar;
                    int c2 = aqvb.c(asvrVar2.d);
                    if (c2 == 0) {
                        c2 = 1;
                    }
                    ajjh.e(c2, asvrVar2.e, tcsVar2);
                }
            }).E(aypa.a());
        }
        final awqc awqcVar = (awqc) obj;
        final View view = tcsVar.a;
        if (view == null) {
            view = tcsVar.b;
        }
        if (view == null) {
            return aynr.s(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((awqcVar.c & 1) == 0 || awqcVar.d.isEmpty()) {
            return aynr.s(new IllegalArgumentException("No accessibility identifier has been provided."));
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return aynr.f();
        }
        return aynr.t(new aypv() { // from class: sry
            @Override // defpackage.aypv
            public final void a() {
                dci dciVar;
                View view2;
                awqc awqcVar2 = awqc.this;
                View view3 = view;
                String str = awqcVar2.d;
                if (view3 instanceof dci) {
                    dciVar = (dci) view3;
                } else {
                    ViewParent parent = view3.getParent();
                    while (parent != null && !(parent instanceof dci)) {
                        parent = parent.getParent();
                    }
                    dciVar = (dci) parent;
                }
                if (dciVar == null) {
                    throw new IllegalStateException("Unable to locate the root LithoView.");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(dciVar);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        view2 = null;
                        break;
                    }
                    view2 = (View) arrayDeque.pollFirst();
                    if (view2 != null) {
                        if (str.equals(view2.getTag())) {
                            break;
                        } else if (view2 instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) view2;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                arrayDeque.add(viewGroup.getChildAt(i3));
                            }
                        }
                    }
                }
                if (view2 == null) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to locate view with accessibility id: ".concat(valueOf) : new String("Unable to locate view with accessibility id: "));
                }
                lj.aq(view2, 64, null);
            }
        });
    }
}
