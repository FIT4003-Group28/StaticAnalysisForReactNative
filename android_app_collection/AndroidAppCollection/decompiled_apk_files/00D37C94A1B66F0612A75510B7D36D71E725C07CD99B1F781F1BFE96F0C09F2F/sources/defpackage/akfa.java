package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: akfa  reason: default package */
/* loaded from: classes.dex */
public final class akfa {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final akfv d;

    public akfa(akfb akfbVar, argj argjVar, View view, acti actiVar, akev akevVar) {
        this.d = new akfv(argjVar.c, view, akfbVar.e);
        this.a = new WeakReference(argjVar);
        this.b = new WeakReference(actiVar);
        this.c = new WeakReference(akevVar);
    }
}
