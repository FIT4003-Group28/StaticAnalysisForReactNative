package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: darr  reason: default package */
/* loaded from: classes5.dex */
public abstract class darr implements darx {
    private final dasb a;
    private long b;

    /* JADX INFO: Access modifiers changed from: protected */
    public darr(String str) {
        dasb dasbVar = str == null ? null : new dasb(str);
        this.b = -1L;
        this.a = dasbVar;
    }

    @Override // defpackage.darx
    public final long a() {
        long j = this.b;
        long j2 = -1;
        if (j == -1) {
            if (b()) {
                j2 = daum.a(this);
            }
            this.b = j2;
            return j2;
        }
        return j;
    }

    @Override // defpackage.darx
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Charset c() {
        dasb dasbVar = this.a;
        if (dasbVar == null || dasbVar.d() == null) {
            return datw.a;
        }
        return this.a.d();
    }

    @Override // defpackage.darx
    public final String d() {
        dasb dasbVar = this.a;
        if (dasbVar == null) {
            return null;
        }
        return dasbVar.b();
    }
}
