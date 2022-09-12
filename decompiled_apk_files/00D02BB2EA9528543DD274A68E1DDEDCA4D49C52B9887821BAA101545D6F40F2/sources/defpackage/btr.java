package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: btr  reason: default package */
/* loaded from: classes.dex */
final class btr implements btt {
    final /* synthetic */ InputStream a;
    final /* synthetic */ bxl b;

    public btr(InputStream inputStream, bxl bxlVar) {
        this.a = inputStream;
        this.b = bxlVar;
    }

    @Override // defpackage.btt
    public final int a(btn btnVar) {
        try {
            return btnVar.c(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
