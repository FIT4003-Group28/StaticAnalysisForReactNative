package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: xki  reason: default package */
/* loaded from: classes4.dex */
public final class xki {
    public final dt a;
    public final aafo b;
    public final xxk c;
    public final xkg d;
    public xvb e;
    public boolean f;
    private final akfg g;

    public xki(dt dtVar, aafo aafoVar, akfg akfgVar, xxk xxkVar) {
        this.a = dtVar;
        this.b = aafoVar;
        this.c = xxkVar;
        this.d = new xkg(this, dtVar, aafoVar, akfgVar, xxkVar);
        this.g = akfgVar;
    }

    private final void c(ex exVar) {
        dp f = this.a.getSupportFragmentManager().f("backstage_post_dialog_fragment");
        if (f != null) {
            exVar.m(f);
        }
        exVar.s();
        this.e = null;
    }

    public final void a(final apli apliVar, xmc xmcVar) {
        if (!this.f) {
            apok apokVar = apliVar.k;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 8192) == 0) {
                zep.b("Command for post button is missing in BackstagePostDialogRenderer");
                return;
            }
            ex l = this.a.getSupportFragmentManager().l();
            c(l);
            this.e = xuz.aE(apliVar);
            xkg xkgVar = this.d;
            xkgVar.b = xmcVar;
            xvb xvbVar = this.e;
            xkgVar.c = xvbVar;
            ((xuz) xvbVar).aA = new xva() { // from class: xke
                @Override // defpackage.xva
                public final void a(aavi aaviVar) {
                    xki xkiVar = xki.this;
                    apli apliVar2 = apliVar;
                    xkiVar.d.d = aaviVar;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xkiVar.d);
                    aafo aafoVar = xkiVar.b;
                    apok apokVar2 = apliVar2.k;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    apzg apzgVar = apojVar2.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, hashMap);
                }
            };
            final xvb xvbVar2 = this.e;
            ((xuz) xvbVar2).aP = new DialogInterface.OnDismissListener() { // from class: xkc
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ajsm ajsmVar;
                    apky apkyVar;
                    aplb aplbVar;
                    apkz apkzVar;
                    int i;
                    int i2;
                    xki xkiVar = xki.this;
                    xvb xvbVar3 = xvbVar2;
                    apli apliVar2 = apliVar;
                    xxk xxkVar = xkiVar.c;
                    byte[] I = apliVar2.x.I();
                    if (I == null) {
                        return;
                    }
                    aopa createBuilder = apkx.a.createBuilder();
                    int i3 = 0;
                    boolean z = xxkVar.d == null;
                    createBuilder.copyOnWrite();
                    apkx apkxVar = (apkx) createBuilder.instance;
                    apkxVar.b |= 2;
                    apkxVar.d = z;
                    aopa createBuilder2 = apkw.a.createBuilder();
                    String str = xxkVar.c;
                    createBuilder2.copyOnWrite();
                    apkw apkwVar = (apkw) createBuilder2.instance;
                    str.getClass();
                    apkwVar.b |= 1;
                    apkwVar.c = str;
                    aoob x = aoob.x(I);
                    createBuilder2.copyOnWrite();
                    apkw apkwVar2 = (apkw) createBuilder2.instance;
                    apkwVar2.b |= 2;
                    apkwVar2.d = x;
                    long j = xxkVar.b;
                    createBuilder2.copyOnWrite();
                    apkw apkwVar3 = (apkw) createBuilder2.instance;
                    apkwVar3.b |= 4;
                    apkwVar3.e = j;
                    createBuilder.copyOnWrite();
                    apkx apkxVar2 = (apkx) createBuilder.instance;
                    apkw apkwVar4 = (apkw) createBuilder2.mo39build();
                    apkwVar4.getClass();
                    apkxVar2.c = apkwVar4;
                    apkxVar2.b |= 1;
                    aopa createBuilder3 = apla.a.createBuilder();
                    xuz xuzVar = (xuz) xvbVar3;
                    String obj = xuzVar.aE.getText().toString();
                    int i4 = 0;
                    while (xuzVar.aH().matcher(obj).find()) {
                        i4++;
                    }
                    int trimmedLength = TextUtils.getTrimmedLength(obj);
                    createBuilder3.copyOnWrite();
                    apla aplaVar = (apla) createBuilder3.instance;
                    aplaVar.b |= 1;
                    aplaVar.c = trimmedLength;
                    int lineCount = xuzVar.aE.getLineCount();
                    createBuilder3.copyOnWrite();
                    apla aplaVar2 = (apla) createBuilder3.instance;
                    aplaVar2.b |= 8;
                    aplaVar2.e = lineCount;
                    createBuilder3.copyOnWrite();
                    apla aplaVar3 = (apla) createBuilder3.instance;
                    aplaVar3.b |= 4;
                    aplaVar3.d = i4;
                    int i5 = xuzVar.aO;
                    createBuilder3.copyOnWrite();
                    apla aplaVar4 = (apla) createBuilder3.instance;
                    aplaVar4.b |= 16;
                    aplaVar4.f = i5;
                    apla aplaVar5 = (apla) createBuilder3.mo39build();
                    if (aplaVar5 != null) {
                        createBuilder.copyOnWrite();
                        apkx apkxVar3 = (apkx) createBuilder.instance;
                        apkxVar3.e = aplaVar5;
                        apkxVar3.b |= 4;
                    }
                    aopa createBuilder4 = apkv.a.createBuilder();
                    xxa xxaVar = xuzVar.aD;
                    if ((xxaVar == null || !xxaVar.c()) && ((ajsmVar = xuzVar.aG) == null || ajsmVar.isEmpty())) {
                        apkyVar = null;
                    } else {
                        aopa createBuilder5 = apky.a.createBuilder();
                        xxa xxaVar2 = xuzVar.aD;
                        int i6 = 3;
                        if (xxaVar2 == null || !xxaVar2.c()) {
                            i = 2;
                            i6 = 2;
                        } else {
                            xxa xxaVar3 = xuzVar.aD;
                            if (xxaVar3.g == 3) {
                                i2 = 3;
                            } else {
                                i2 = xxaVar3.d() ? 4 : 2;
                            }
                            xxa xxaVar4 = xuzVar.aD;
                            int intrinsicWidth = xxaVar4.a.getDrawable() == null ? 0 : xxaVar4.a.getDrawable().getIntrinsicWidth();
                            createBuilder5.copyOnWrite();
                            apky apkyVar2 = (apky) createBuilder5.instance;
                            apkyVar2.b |= 8;
                            apkyVar2.f = intrinsicWidth;
                            xxa xxaVar5 = xuzVar.aD;
                            int intrinsicHeight = xxaVar5.a.getDrawable() == null ? 0 : xxaVar5.a.getDrawable().getIntrinsicHeight();
                            createBuilder5.copyOnWrite();
                            apky apkyVar3 = (apky) createBuilder5.instance;
                            apkyVar3.b |= 16;
                            apkyVar3.g = intrinsicHeight;
                            int i7 = xuzVar.aD.h;
                            createBuilder5.copyOnWrite();
                            apky apkyVar4 = (apky) createBuilder5.instance;
                            apkyVar4.b |= 4;
                            int i8 = i2;
                            apkyVar4.e = i7;
                            int i9 = xuzVar.aD.j;
                            createBuilder5.copyOnWrite();
                            apky apkyVar5 = (apky) createBuilder5.instance;
                            apkyVar5.b |= 32;
                            apkyVar5.h = i9;
                            i = i8;
                        }
                        createBuilder5.copyOnWrite();
                        apky apkyVar6 = (apky) createBuilder5.instance;
                        apkyVar6.c = i - 1;
                        apkyVar6.b |= 1;
                        createBuilder5.copyOnWrite();
                        apky apkyVar7 = (apky) createBuilder5.instance;
                        apkyVar7.d = i6 - 1;
                        apkyVar7.b |= 2;
                        apkyVar = (apky) createBuilder5.mo39build();
                    }
                    if (apkyVar != null) {
                        createBuilder4.copyOnWrite();
                        apkv apkvVar = (apkv) createBuilder4.instance;
                        apkvVar.c = apkyVar;
                        apkvVar.b |= 1;
                    }
                    if (xuzVar.aI.getVisibility() != 0) {
                        aplbVar = null;
                    } else {
                        aopa createBuilder6 = aplb.a.createBuilder();
                        createBuilder6.copyOnWrite();
                        aplb aplbVar2 = (aplb) createBuilder6.instance;
                        aplbVar2.d = 1;
                        aplbVar2.b |= 2;
                        String str2 = xuzVar.aK;
                        createBuilder6.copyOnWrite();
                        aplb aplbVar3 = (aplb) createBuilder6.instance;
                        str2.getClass();
                        aplbVar3.b |= 1;
                        aplbVar3.c = str2;
                        aplbVar = (aplb) createBuilder6.mo39build();
                    }
                    if (aplbVar != null) {
                        createBuilder4.copyOnWrite();
                        apkv apkvVar2 = (apkv) createBuilder4.instance;
                        apkvVar2.e = aplbVar;
                        apkvVar2.b |= 4;
                    }
                    if (xuzVar.aF.getVisibility() != 0) {
                        apkzVar = null;
                    } else {
                        aopa createBuilder7 = apkz.a.createBuilder();
                        int i10 = 0;
                        for (String str3 : xuzVar.aF.a()) {
                            if (TextUtils.isEmpty(str3)) {
                                i3++;
                            } else {
                                i10++;
                            }
                        }
                        createBuilder7.copyOnWrite();
                        apkz apkzVar2 = (apkz) createBuilder7.instance;
                        apkzVar2.b |= 2;
                        apkzVar2.d = i3;
                        createBuilder7.copyOnWrite();
                        apkz apkzVar3 = (apkz) createBuilder7.instance;
                        apkzVar3.b |= 1;
                        apkzVar3.c = i10;
                        apkzVar = (apkz) createBuilder7.mo39build();
                    }
                    if (apkzVar != null) {
                        createBuilder4.copyOnWrite();
                        apkv apkvVar3 = (apkv) createBuilder4.instance;
                        apkvVar3.d = apkzVar;
                        apkvVar3.b |= 2;
                    }
                    createBuilder.copyOnWrite();
                    apkx apkxVar4 = (apkx) createBuilder.instance;
                    apkv apkvVar4 = (apkv) createBuilder4.mo39build();
                    apkvVar4.getClass();
                    apkxVar4.f = apkvVar4;
                    apkxVar4.b |= 8;
                    String str4 = xxkVar.d;
                    if (str4 != null) {
                        createBuilder.copyOnWrite();
                        apkx apkxVar5 = (apkx) createBuilder.instance;
                        apkxVar5.b |= 16;
                        apkxVar5.g = str4;
                    }
                    arrf a = arrh.a();
                    a.copyOnWrite();
                    ((arrh) a.instance).cb((apkx) createBuilder.mo39build());
                    xxkVar.a.c((arrh) a.mo39build());
                }
            };
            xxk xxkVar = this.c;
            String valueOf = String.valueOf(UUID.randomUUID());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("backstage_post_creation_flow:");
            sb.append(valueOf);
            sb.append(":0");
            xxkVar.c = sb.toString();
            xxkVar.b = System.currentTimeMillis() * 1000;
            xxkVar.d = null;
            this.e.s(l, "backstage_post_dialog_fragment");
        }
    }

    public final void b(final apli apliVar, xmd xmdVar) {
        if (!this.f) {
            apok apokVar = apliVar.k;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 8192) == 0) {
                zep.b("Command for post button is missing in BackstagePostDialogRenderer");
                return;
            }
            ex l = this.a.getSupportFragmentManager().l();
            c(l);
            this.e = xuz.aE(apliVar);
            final xkh xkhVar = new xkh(this, this.e, xmdVar, this.g, this.b);
            ((xuz) this.e).aA = new xva() { // from class: xkd
                @Override // defpackage.xva
                public final void a(aavi aaviVar) {
                    xki xkiVar = xki.this;
                    xkh xkhVar2 = xkhVar;
                    apli apliVar2 = apliVar;
                    xkhVar2.a = aaviVar.a;
                    xkhVar2.b = aaviVar.d;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xkhVar2);
                    hashMap.put("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key", true);
                    aafo aafoVar = xkiVar.b;
                    apok apokVar2 = apliVar2.k;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    apzg apzgVar = apojVar2.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, hashMap);
                }
            };
            this.e.s(l, "backstage_post_dialog_fragment");
        }
    }
}
