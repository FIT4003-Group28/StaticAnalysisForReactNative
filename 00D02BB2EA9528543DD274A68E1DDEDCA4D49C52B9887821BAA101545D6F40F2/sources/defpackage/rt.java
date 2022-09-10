package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: rt  reason: default package */
/* loaded from: classes.dex */
public final class rt {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    vf h;
    vb i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public rt(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(vf vfVar) {
        vb vbVar;
        vf vfVar2 = this.h;
        if (vfVar == vfVar2) {
            return;
        }
        if (vfVar2 != null) {
            vfVar2.c(this.i);
        }
        this.h = vfVar;
        if (vfVar == null || (vbVar = this.i) == null) {
            return;
        }
        vfVar.a(vbVar);
    }
}
