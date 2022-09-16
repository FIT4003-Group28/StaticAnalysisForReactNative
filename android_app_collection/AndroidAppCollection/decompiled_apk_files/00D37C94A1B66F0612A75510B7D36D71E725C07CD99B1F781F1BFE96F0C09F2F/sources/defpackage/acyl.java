package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: acyl  reason: default package */
/* loaded from: classes.dex */
final class acyl extends acyk {
    public String c = "";

    @Override // defpackage.acyk, defpackage.adwb
    public final void i(yrb yrbVar) {
        super.i(yrbVar);
        yqz yqzVar = yrbVar.d;
        if (yqzVar == null) {
            zep.c(acyo.a, "Bind Channel: http response body is null");
            return;
        }
        try {
            this.c = yqzVar.c();
        } catch (IOException e) {
            this.b = e;
        }
    }
}
