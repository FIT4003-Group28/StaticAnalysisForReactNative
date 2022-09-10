package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cvlr  reason: default package */
/* loaded from: classes5.dex */
public final class cvlr {
    public final Context a;
    private final cvjs b;
    private final cqat c;
    private final cvmv d;
    private final cvmt e;
    private final cvor f;
    private final pbk g;

    public cvlr(Context context, cvjs cvjsVar, cqat cqatVar, cvmv cvmvVar, cvmt cvmtVar, cvor cvorVar, pbk pbkVar) {
        this.a = context;
        this.b = cvjsVar;
        this.c = cqatVar;
        this.d = cvmvVar;
        this.e = cvmtVar;
        this.f = cvorVar;
        this.g = pbkVar;
    }

    public final cvlp a(drwv drwvVar) {
        return new cvlt(this, drwvVar, 0, 0, this.b, this.d, this.e, this.f, this.g);
    }

    public final cvlp b(int i) {
        return new cvlt(this, null, i, 0, this.b, this.d, this.e, this.f, this.g);
    }

    public final cvlp c(int i) {
        return new cvlt(this, null, 0, i, this.b, this.d, this.e, this.f, this.g);
    }
}
