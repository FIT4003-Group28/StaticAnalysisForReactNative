package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cogp  reason: default package */
/* loaded from: classes5.dex */
public abstract class cogp extends cogf {
    @Override // defpackage.cogf
    public final void a(String str, byte[] bArr, byte[] bArr2, cohi cohiVar) {
        try {
            dsok dsokVar = (dsok) dsqw.cq(dsok.c, bArr);
            try {
                if (!dsokVar.a.isEmpty() && !"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(dsokVar.a)) {
                    throw new dsrm(String.format("Incorrect type url: %s, expected: %s", dsokVar.a, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                }
                dgyt dgytVar = (dgyt) dsqw.cp(dgyt.h, dsokVar.b);
                dstv dstvVar = dgytVar.e;
                if (dstvVar == null) {
                    dstvVar = dstv.c;
                }
                if (dstvVar.a >= 0) {
                    dstv dstvVar2 = dgytVar.e;
                    if (dstvVar2 == null) {
                        dstvVar2 = dstv.c;
                    }
                    if (dstvVar2.b >= 0) {
                        dstv dstvVar3 = dgytVar.e;
                        if (dstvVar3 == null) {
                            dstvVar3 = dstv.c;
                        }
                        if (dstvVar3.b <= 999999999) {
                            dstv dstvVar4 = dgytVar.f;
                            if (dstvVar4 == null) {
                                dstvVar4 = dstv.c;
                            }
                            if (dstvVar4.a >= 0) {
                                dstv dstvVar5 = dgytVar.f;
                                if (dstvVar5 == null) {
                                    dstvVar5 = dstv.c;
                                }
                                if (dstvVar5.b >= 0) {
                                    dstv dstvVar6 = dgytVar.f;
                                    if (dstvVar6 == null) {
                                        dstvVar6 = dstv.c;
                                    }
                                    if (dstvVar6.b <= 999999999) {
                                        dstv dstvVar7 = dgytVar.f;
                                        if (dstvVar7 == null) {
                                            dstvVar7 = dstv.c;
                                        }
                                        long j = dstvVar7.a;
                                        dstv dstvVar8 = dgytVar.e;
                                        if (dstvVar8 == null) {
                                            dstvVar8 = dstv.c;
                                        }
                                        if (j >= dstvVar8.a) {
                                            try {
                                                dgyq dgyqVar = (dgyq) dsqw.cq(dgyq.c, bArr2);
                                                cogy b = b(this);
                                                cogy.a(str);
                                                cohiVar.a(new cogs(b.b, str, dgytVar, dgyqVar, b.c));
                                                return;
                                            } catch (dsrm e) {
                                                e.getMessage();
                                                cohiVar.b(10, e.getMessage());
                                                return;
                                            }
                                        }
                                        throw new dsrm("End date before start date");
                                    }
                                }
                                throw new dsrm("Invalid end date nanos");
                            }
                            throw new dsrm("End date less than zero");
                        }
                    }
                    throw new dsrm("Invalid start date nanos");
                }
                throw new dsrm("Start date less than zero");
            } catch (dsrm e2) {
                String valueOf = String.valueOf(e2.getMessage());
                cohiVar.b(10, valueOf.length() != 0 ? "Error parsing SelectionCriteria proto: ".concat(valueOf) : new String("Error parsing SelectionCriteria proto: "));
            }
        } catch (dsrm unused) {
            cohiVar.b(10, "Error parsing Any proto from criteria");
        }
    }

    protected abstract cogy b(Context context);
}
