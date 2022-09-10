package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: avmq  reason: default package */
/* loaded from: classes3.dex */
public final class avmq implements avns {
    public final dbty<? extends awck> a;
    private final awmu b;

    public avmq(awmu awmuVar, dbty<? extends awck> dbtyVar) {
        this.b = awmuVar;
        this.a = dbtyVar;
    }

    @Override // defpackage.avns
    public final dehn<avno> a(final avnm avnmVar) {
        return deee.h(degp.q(this.b.a("getSnaptiles", new awmn(this, avnmVar) { // from class: avml
            private final avmq a;
            private final avnm b;

            {
                this.a = this;
                this.b = avnmVar;
            }

            @Override // defpackage.awmn
            public final dehn a(dehp dehpVar) {
                avmq avmqVar = this.a;
                final avnm avnmVar2 = this.b;
                final awck a = avmqVar.a.a();
                final Callable callable = new Callable(a, avnmVar2) { // from class: avmo
                    private final awck a;
                    private final avnm b;

                    {
                        this.a = a;
                        this.b = avnmVar2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
                        throw new defpackage.dsrl("Bad input or 'fieldNumber' isn't a message");
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 541
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmo.call():java.lang.Object");
                    }
                };
                dehn dehnVar = (dehn) a.Qu(new dbty(callable) { // from class: avmm
                    private final Callable a;

                    {
                        this.a = callable;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        try {
                            return deha.a(this.a.call());
                        } catch (anam e) {
                            return deha.b(new avlo(e.a, e));
                        } catch (avlo e2) {
                            return deha.b(e2);
                        } catch (Exception e3) {
                            return deha.b(new avlo(drtc.INTERNAL, e3));
                        }
                    }
                });
                if (dehnVar != null) {
                    return dehnVar;
                }
                throw new avlo(drtc.INTERNAL, "details hidden by doRoadGraphTileWork");
            }
        })), awmq.class, avmn.a, this.b.a);
    }
}
