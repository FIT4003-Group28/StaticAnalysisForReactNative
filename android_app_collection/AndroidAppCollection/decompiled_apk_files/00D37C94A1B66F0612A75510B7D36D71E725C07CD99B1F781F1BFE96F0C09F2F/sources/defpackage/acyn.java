package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: acyn  reason: default package */
/* loaded from: classes.dex */
final class acyn extends acyk {
    String c;

    @Override // defpackage.acyk, defpackage.adwb
    public final void a(IOException iOException) {
        this.b = iOException;
        this.a = iOException instanceof ypr ? 505 : 500;
    }

    @Override // defpackage.acyk, defpackage.adwb
    public final void i(yrb yrbVar) {
        super.i(yrbVar);
        yqz yqzVar = yrbVar.d;
        if (yqzVar != null) {
            try {
                this.c = yqzVar.c();
            } catch (IOException e) {
                a(e);
            }
        }
    }
}
