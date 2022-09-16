package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hrj  reason: default package */
/* loaded from: classes3.dex */
public final class hrj implements yiw {
    final /* synthetic */ hrk a;

    public hrj(hrk hrkVar) {
        this.a = hrkVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        this.a.u.d(new Runnable() { // from class: hrh
            @Override // java.lang.Runnable
            public final void run() {
                hrk hrkVar = hrj.this.a;
                hrkVar.u.g(hrkVar.x);
            }
        });
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Uri uri = (Uri) obj;
        final Drawable drawable = (Drawable) obj2;
        this.a.u.d(new Runnable() { // from class: hri
            @Override // java.lang.Runnable
            public final void run() {
                hrj hrjVar = hrj.this;
                Uri uri2 = uri;
                Drawable drawable2 = drawable;
                final hrk hrkVar = hrjVar.a;
                ylr.c();
                hrkVar.u.e(uri2);
                hrkVar.t.setImageDrawable(drawable2);
                hrkVar.t.setOnClickListener(new View.OnClickListener() { // from class: hrg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        axby axbyVar;
                        hrk hrkVar2 = hrk.this;
                        ((htf) hrkVar2.u).p.b(hrkVar2.x, hrkVar2.w);
                        if (hrkVar2.u.a() != null) {
                            hrkVar2.u.a().H(3, new acte(hve.e(hrkVar2.v).I()), null);
                            hrkVar2.u.a().n(new acte(actj.UPLOAD_VIDEO_EDITING_STICKER));
                        }
                        hrm hrmVar = ((htf) hrkVar2.u).w;
                        if (hrmVar != null) {
                            hrmVar.a();
                        }
                        htf htfVar = (htf) hrkVar2.u;
                        final hut hutVar = htfVar.l;
                        aunb aunbVar = hrkVar2.x;
                        boolean z = htfVar.v;
                        axbl j = axbm.j();
                        Uri b = hve.b(aunbVar);
                        if (b == null) {
                            afus.b(2, 24, "VideoFX: Static Sticker added without valid uri");
                            return;
                        }
                        if (hve.d(aunbVar).size() > 1) {
                            hutVar.g.oi().n(new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON));
                        }
                        aopa createBuilder = axby.a.createBuilder();
                        aopa createBuilder2 = awzs.a.createBuilder();
                        String c = hve.c(b);
                        createBuilder2.copyOnWrite();
                        awzs awzsVar = (awzs) createBuilder2.instance;
                        c.getClass();
                        awzsVar.b = 1;
                        awzsVar.c = c;
                        createBuilder.copyOnWrite();
                        axby axbyVar2 = (axby) createBuilder.instance;
                        awzs awzsVar2 = (awzs) createBuilder2.mo39build();
                        awzsVar2.getClass();
                        axbyVar2.c = awzsVar2;
                        axbyVar2.b |= 2;
                        List d = hve.d(aunbVar);
                        if (!d.isEmpty()) {
                            aopa createBuilder3 = axbx.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            axbx axbxVar = (axbx) createBuilder3.instance;
                            aopu aopuVar = axbxVar.d;
                            if (!aopuVar.c()) {
                                axbxVar.d = aopi.mutableCopy(aopuVar);
                            }
                            aonk.addAll((Iterable) d, (List) axbxVar.d);
                            String str = (String) d.get(0);
                            createBuilder3.copyOnWrite();
                            axbx axbxVar2 = (axbx) createBuilder3.instance;
                            str.getClass();
                            axbxVar2.b |= 1;
                            axbxVar2.c = str;
                            axbx axbxVar3 = (axbx) createBuilder3.mo39build();
                            createBuilder.copyOnWrite();
                            axby axbyVar3 = (axby) createBuilder.instance;
                            axbxVar3.getClass();
                            axbyVar3.d = axbxVar3;
                            axbyVar3.b |= 4;
                        }
                        final List d2 = hve.d(aunbVar);
                        if (!d2.isEmpty()) {
                            hutVar.c.execute(new Runnable() { // from class: huq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hut hutVar2 = hut.this;
                                    for (String str2 : d2) {
                                        hutVar2.a.a(Uri.parse(str2), hutVar2.e);
                                    }
                                }
                            });
                        }
                        aopa createBuilder4 = axbk.a.createBuilder();
                        createBuilder4.copyOnWrite();
                        axbk axbkVar = (axbk) createBuilder4.instance;
                        axby axbyVar4 = (axby) createBuilder.mo39build();
                        axbyVar4.getClass();
                        axbkVar.d = axbyVar4;
                        axbkVar.c = 2;
                        createBuilder4.copyOnWrite();
                        axbk axbkVar2 = (axbk) createBuilder4.instance;
                        axbkVar2.b |= 4096;
                        axbkVar2.e = z;
                        boolean b2 = hutVar.d.b();
                        createBuilder4.copyOnWrite();
                        axbk axbkVar3 = (axbk) createBuilder4.instance;
                        axbkVar3.b |= 8192;
                        axbkVar3.f = b2;
                        j.copyOnWrite();
                        ((axbm) j.instance).F((axbk) createBuilder4.mo39build());
                        j.copyOnWrite();
                        ((axbm) j.instance).G(512);
                        j.copyOnWrite();
                        ((axbm) j.instance).D(512);
                        hutVar.b.aH(j);
                        axbk i = ((axbm) j.instance).i();
                        if (i.c == 2) {
                            axbyVar = (axby) i.d;
                        } else {
                            axbyVar = axby.a;
                        }
                        axbx axbxVar4 = axbyVar.d;
                        if (axbxVar4 == null) {
                            axbxVar4 = axbx.a;
                        }
                        if (axbxVar4.d.size() <= 1) {
                            return;
                        }
                        htu htuVar = hutVar.f;
                        htuVar.c(Math.round((htuVar.b / 2.0f) - htuVar.g));
                    }
                });
                String str = null;
                if (hrkVar.u.a() != null) {
                    acti a = hrkVar.u.a();
                    auzi auziVar = hrkVar.v;
                    a.v(auziVar, hve.e(auziVar), null);
                }
                ImageView imageView = hrkVar.t;
                auzi auziVar2 = hrkVar.v;
                if (auziVar2 != null) {
                    if ((auziVar2.b & 1) != 0) {
                        avhn avhnVar = auziVar2.c;
                        if (avhnVar == null) {
                            avhnVar = avhn.a;
                        }
                        aovs aovsVar = avhnVar.d;
                        if (aovsVar == null) {
                            aovsVar = aovs.a;
                        }
                        aovr aovrVar = aovsVar.c;
                        if (aovrVar == null) {
                            aovrVar = aovr.a;
                        }
                        str = aovrVar.c;
                    } else if (auziVar2.d.size() != 0) {
                        aovs aovsVar2 = ((avhn) auziVar2.d.get(0)).d;
                        if (aovsVar2 == null) {
                            aovsVar2 = aovs.a;
                        }
                        aovr aovrVar2 = aovsVar2.c;
                        if (aovrVar2 == null) {
                            aovrVar2 = aovr.a;
                        }
                        str = aovrVar2.c;
                    }
                }
                imageView.setContentDescription(str);
            }
        });
    }
}
