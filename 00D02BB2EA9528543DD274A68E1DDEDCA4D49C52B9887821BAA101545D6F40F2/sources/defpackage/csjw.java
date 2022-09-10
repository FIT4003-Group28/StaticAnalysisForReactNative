package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: csjw  reason: default package */
/* loaded from: classes5.dex */
public final class csjw {
    public final csiz<ddhh> a;

    public csjw(csiz<ddhh> csizVar) {
        this.a = csizVar;
    }

    public static void a(ddhh[] ddhhVarArr, int i, boolean z) {
        ddhh ddhhVar = ddhhVarArr[i];
        if (ddhhVar.g(ddcm.a)) {
            z = true;
        } else if (z) {
            dsqv<ddhk, Long> dsqvVar = ddcm.a;
            ddhk ddhkVar = (ddhk) ddhhVar.b;
            ddhhVar.k(dsqvVar, Long.valueOf((ddhkVar.b << 32) | ddhkVar.c));
        }
        for (Integer num : Collections.unmodifiableList(((ddhk) ddhhVar.b).d)) {
            a(ddhhVarArr, num.intValue(), z);
        }
    }
}
