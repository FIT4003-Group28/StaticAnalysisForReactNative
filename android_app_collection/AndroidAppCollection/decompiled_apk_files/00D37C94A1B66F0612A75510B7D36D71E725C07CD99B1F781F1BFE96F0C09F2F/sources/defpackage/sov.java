package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sov  reason: default package */
/* loaded from: classes4.dex */
public final class sov {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final AtomicReference c;
    public final sou[] d;
    public final sou[] e;
    public final soj[] f;

    public sov(soj[] sojVarArr) {
        this.f = sojVarArr;
        int length = sojVarArr.length;
        int i = length + 1;
        sou[] souVarArr = new sou[i];
        sou[] souVarArr2 = new sou[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            souVarArr[i3] = new sou(b, i3);
            souVarArr2[i3] = new sou(a, i3);
        }
        this.d = souVarArr;
        this.e = souVarArr2;
        sou souVar = souVarArr[0];
        while (i2 < length) {
            sou souVar2 = new sou(souVar, i2);
            i2++;
            souVar = souVar2;
        }
        this.c = new AtomicReference(souVar);
    }
}
