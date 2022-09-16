package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ijh  reason: default package */
/* loaded from: classes3.dex */
public final class ijh implements afzf {
    final /* synthetic */ EditVideoActivity a;
    final /* synthetic */ aopa b;

    public ijh(EditVideoActivity editVideoActivity, aopa aopaVar) {
        this.a = editVideoActivity;
        this.b = aopaVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.w.b(true);
        zep.d("Error updating video metadata", cffVar);
        zag.q(this.a, R.string.edit_video_error_failed, 0);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [ampq] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ampq] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ampq] */
    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ampq ampqVar;
        final amon amonVar;
        amon amonVar2;
        arxm arxmVar = (arxm) obj;
        arxmVar.getClass();
        this.a.w.b(true);
        if ((arxmVar.b & 4) != 0) {
            arxp arxpVar = arxmVar.d;
            if (arxpVar == null) {
                arxpVar = arxp.a;
            }
            int B = akpq.B(arxpVar.c);
            if (B == 0 || B == 1) {
                EditVideoActivity editVideoActivity = this.a;
                aadd aaddVar = editVideoActivity.C;
                if (aaddVar != null && aaddVar.a() != null) {
                    avvf avvfVar = editVideoActivity.C.a().h;
                    if (avvfVar == null) {
                        avvfVar = avvf.a;
                    }
                    if (avvfVar.e) {
                        EditVideoActivity editVideoActivity2 = this.a;
                        arxl arxlVar = (arxl) this.b.mo39build();
                        arxlVar.getClass();
                        if (editVideoActivity2.u) {
                            return;
                        }
                        int i = arxlVar.b;
                        int i2 = i & 8;
                        if (i2 != 0 || (i & 64) != 0) {
                            if (i2 != 0) {
                                arxg arxgVar = arxlVar.f;
                                if (arxgVar == null) {
                                    arxgVar = arxg.a;
                                }
                                ampqVar = ampq.j(arxgVar.c);
                            } else {
                                ampqVar = amon.a;
                            }
                            final ampq ampqVar2 = ampqVar;
                            amon amonVar3 = amon.a;
                            if ((arxlVar.b & 64) != 0) {
                                arxa arxaVar = arxlVar.i;
                                if (arxaVar == null) {
                                    arxaVar = arxa.a;
                                }
                                int bX = awwc.bX(arxaVar.c);
                                if (bX == 0) {
                                    bX = 1;
                                }
                                int i3 = bX - 1;
                                if (i3 == 1) {
                                    amonVar2 = ampq.j(alcz.PUBLIC);
                                } else if (i3 != 2) {
                                    amonVar2 = ampq.j(alcz.PRIVATE);
                                } else {
                                    amonVar2 = ampq.j(alcz.UNLISTED);
                                }
                                amonVar = amonVar2;
                            } else {
                                amonVar = amonVar3;
                            }
                            final akys akysVar = editVideoActivity2.o;
                            final String str = editVideoActivity2.s;
                            final afvm c = editVideoActivity2.i.c();
                            anlz.A(anlz.v(new aniq() { // from class: akym
                                @Override // defpackage.aniq
                                public final ankt a() {
                                    alcw alcwVar;
                                    akys akysVar2 = akys.this;
                                    String str2 = str;
                                    afvm afvmVar = c;
                                    final ampq ampqVar3 = ampqVar2;
                                    final ampq ampqVar4 = amonVar;
                                    boolean z = true;
                                    aqxo.q(!str2.isEmpty(), "Invalid or empty passed Video ID.");
                                    aqxo.q(!afvmVar.z(), "Cannot use a signed-out identity.");
                                    if (ampqVar3.h()) {
                                        aqxo.q(!((String) ampqVar3.c()).isEmpty(), "Invalid or empty video title.");
                                    }
                                    Iterator it = ((List) akysVar2.b(afvmVar).get()).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            alcwVar = null;
                                            break;
                                        }
                                        alcwVar = (alcw) it.next();
                                        if (str2.equals(alcwVar.W)) {
                                            break;
                                        }
                                    }
                                    if (alcwVar != null) {
                                        alcu a = alcu.a(alcwVar.l);
                                        if (a == null) {
                                            a = alcu.UNKNOWN_UPLOAD;
                                        }
                                        if (a == alcu.FEEDBACK_ONLY_UPLOAD) {
                                            albg a2 = akysVar2.f.a(alcwVar.k, new akzs() { // from class: akyi
                                                @Override // defpackage.akzs
                                                public final alcw a(alcw alcwVar2) {
                                                    ampq ampqVar5 = ampq.this;
                                                    ampq ampqVar6 = ampqVar4;
                                                    if (alcwVar2 == null) {
                                                        return null;
                                                    }
                                                    aqxo.q((alcwVar2.b & 16) != 0, "Feedback only upload hasn't any metadata set.");
                                                    alda aldaVar = alcwVar2.i;
                                                    if (aldaVar == null) {
                                                        aldaVar = alda.a;
                                                    }
                                                    aopa mo52toBuilder = aldaVar.mo52toBuilder();
                                                    if (ampqVar5.h()) {
                                                        mo52toBuilder.copyOnWrite();
                                                        alda aldaVar2 = (alda) mo52toBuilder.instance;
                                                        aldaVar2.b = 1 | aldaVar2.b;
                                                        aldaVar2.c = (String) ampqVar5.c();
                                                    }
                                                    if (ampqVar6.h()) {
                                                        mo52toBuilder.copyOnWrite();
                                                        alda aldaVar3 = (alda) mo52toBuilder.instance;
                                                        aldaVar3.e = ((alcz) ampqVar6.c()).d;
                                                        aldaVar3.b |= 4;
                                                    }
                                                    aopa mo52toBuilder2 = alcwVar2.mo52toBuilder();
                                                    mo52toBuilder2.copyOnWrite();
                                                    alcw alcwVar3 = (alcw) mo52toBuilder2.instance;
                                                    alda aldaVar4 = (alda) mo52toBuilder.mo39build();
                                                    aldaVar4.getClass();
                                                    alcwVar3.i = aldaVar4;
                                                    alcwVar3.b |= 16;
                                                    return (alcw) mo52toBuilder2.mo39build();
                                                }
                                            });
                                            alcw alcwVar2 = a2.a;
                                            alcw alcwVar3 = a2.b;
                                            if (alcwVar2 != null && alcwVar3 != null) {
                                                alda aldaVar = alcwVar2.i;
                                                if (aldaVar == null) {
                                                    aldaVar = alda.a;
                                                }
                                                alda aldaVar2 = alcwVar3.i;
                                                if (aldaVar2 == null) {
                                                    aldaVar2 = alda.a;
                                                }
                                                if (!akzj.f(aldaVar, aldaVar2)) {
                                                    akysVar2.k.c(alcwVar.k, aldaVar2);
                                                }
                                            }
                                            if (a2.b == null) {
                                                z = false;
                                            }
                                            return anlz.q(Boolean.valueOf(z));
                                        }
                                    }
                                    return anlz.q(false);
                                }
                            }, akysVar.c), new akyr(akysVar, 1), anjk.a);
                            editVideoActivity2.q();
                            return;
                        }
                        editVideoActivity2.q();
                        return;
                    }
                }
                this.a.q();
                return;
            }
        }
        final EditVideoActivity editVideoActivity3 = this.a;
        final arxp arxpVar2 = arxmVar.d;
        if (arxpVar2 == null) {
            arxpVar2 = arxp.a;
        }
        if (arxpVar2 != null) {
            arag aragVar = arxpVar2.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            CharSequence b = ajgl.b(aragVar);
            if (TextUtils.isEmpty(b)) {
                b = editVideoActivity3.getResources().getString(R.string.error_generic);
            }
            fvg d = fvl.d();
            d.i(0);
            d.k(b);
            arag aragVar2 = arxpVar2.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b2 = ajgl.b(aragVar2);
            if ((arxpVar2.b & 8) != 0 && !TextUtils.isEmpty(b2)) {
                d.m(b2, new View.OnClickListener() { // from class: ijd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditVideoActivity editVideoActivity4 = EditVideoActivity.this;
                        arxp arxpVar3 = arxpVar2;
                        aafo aafoVar = editVideoActivity4.h;
                        apzg apzgVar = arxpVar3.f;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, null);
                    }
                });
            }
            editVideoActivity3.v = d.b();
            editVideoActivity3.m.i(editVideoActivity3.v);
        }
    }
}
