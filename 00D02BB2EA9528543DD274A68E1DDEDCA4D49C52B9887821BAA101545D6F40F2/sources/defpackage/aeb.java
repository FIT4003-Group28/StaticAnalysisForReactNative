package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeb  reason: default package */
/* loaded from: classes2.dex */
public final class aeb {
    int a;
    int b;
    boolean c;
    boolean d;
    boolean e;
    int[] f;
    final /* synthetic */ aeh g;

    public aeb(aeh aehVar) {
        this.g = aehVar;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
