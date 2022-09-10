package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bwdq  reason: default package */
/* loaded from: classes4.dex */
public class bwdq implements Serializable {
    final bweo a;
    final cjtd b;
    final czgq c;
    final int d = 37;

    public bwdq(bweo bweoVar, cjtd cjtdVar, int i, czgq czgqVar) {
        this.a = bweoVar;
        this.b = cjtdVar;
        this.c = czgqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, bwqv bwqvVar) {
        bwqvVar.c(bundle, "serializableState", this);
    }
}
