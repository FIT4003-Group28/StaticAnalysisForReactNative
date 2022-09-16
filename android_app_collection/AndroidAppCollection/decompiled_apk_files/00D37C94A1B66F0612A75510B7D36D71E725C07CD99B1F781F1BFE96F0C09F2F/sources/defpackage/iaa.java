package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iaa  reason: default package */
/* loaded from: classes3.dex */
final class iaa implements ibc {
    final /* synthetic */ ankb a;
    final /* synthetic */ long b;
    final /* synthetic */ iai c;
    private final /* synthetic */ int d;

    public iaa(iai iaiVar, ankb ankbVar, long j) {
        this.c = iaiVar;
        this.a = ankbVar;
        this.b = j;
    }

    public iaa(iai iaiVar, ankb ankbVar, long j, int i) {
        this.d = i;
        this.c = iaiVar;
        this.a = ankbVar;
        this.b = j;
    }

    @Override // defpackage.ibc
    public final void a() {
        if (this.d == 0) {
            this.a.a(new Exception("ReelWatchSequence has error response"));
        } else {
            this.a.a(new Exception("ReelWatchSequence has error response"));
        }
    }

    @Override // defpackage.ibc
    public final void b() {
        if (this.d == 0) {
            this.a.b(Optional.ofNullable(this.c.m.I(this.b)));
        } else {
            this.a.b(Optional.ofNullable(this.c.m.H(this.b)));
        }
    }
}
