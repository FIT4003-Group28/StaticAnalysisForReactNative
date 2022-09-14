package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: baht  reason: default package */
/* loaded from: classes3.dex */
class baht implements baer {
    final cqsn a;
    final cqsn b;
    final cqtd c;
    final Runnable d;
    final cjtd e;

    public baht(cqsn cqsnVar, cqsn cqsnVar2, cqtd cqtdVar, Runnable runnable, cjtd cjtdVar) {
        this.a = cqsnVar;
        this.b = cqsnVar2;
        this.c = cqtdVar;
        this.d = runnable;
        this.e = cjtdVar;
    }

    @Override // defpackage.baer
    public cqsn a() {
        return this.a;
    }

    @Override // defpackage.baer
    public cqsn b() {
        return this.b;
    }

    @Override // defpackage.baer
    public cqtd c() {
        return this.c;
    }

    @Override // defpackage.baer
    public cjtd d() {
        return this.e;
    }

    @Override // defpackage.baer
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: bahs
            private final baht a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d.run();
            }
        };
    }
}
