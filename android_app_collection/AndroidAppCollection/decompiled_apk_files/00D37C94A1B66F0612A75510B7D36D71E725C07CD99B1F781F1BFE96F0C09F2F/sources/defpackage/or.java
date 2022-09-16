package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: or  reason: default package */
/* loaded from: classes4.dex */
public final class or {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public sf h;
    sb i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public or(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(sf sfVar) {
        sb sbVar;
        sf sfVar2 = this.h;
        if (sfVar == sfVar2) {
            return;
        }
        if (sfVar2 != null) {
            sfVar2.m(this.i);
        }
        this.h = sfVar;
        if (sfVar == null || (sbVar = this.i) == null) {
            return;
        }
        sfVar.g(sbVar);
    }
}
