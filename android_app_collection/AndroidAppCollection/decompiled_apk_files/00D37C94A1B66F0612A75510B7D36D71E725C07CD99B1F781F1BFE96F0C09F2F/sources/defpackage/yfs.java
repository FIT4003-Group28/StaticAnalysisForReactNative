package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.CommerceActionCommandOuterClass$CommerceActionCommand;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yfs  reason: default package */
/* loaded from: classes4.dex */
public final class yfs implements aafl {
    public final aafo a;
    public final yzj b;
    public final yat c = new yat();
    public final acth d;
    private final Activity e;
    private final abeg f;
    private final aagi g;
    private final Executor h;

    public yfs(Activity activity, aafo aafoVar, abeg abegVar, aagi aagiVar, yzj yzjVar, acth acthVar, Executor executor) {
        this.e = activity;
        this.f = abegVar;
        this.a = aafoVar;
        this.g = aagiVar;
        this.b = yzjVar;
        this.d = acthVar;
        this.h = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        byte[] c;
        final CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = (CommerceActionCommandOuterClass$CommerceActionCommand) apzgVar.qm(CommerceActionCommandOuterClass$CommerceActionCommand.commerceActionCommand);
        if (!commerceActionCommandOuterClass$CommerceActionCommand.h) {
            this.c.show(this.e.getFragmentManager(), yat.a);
        }
        abeg abegVar = this.f;
        abef abefVar = new abef(abegVar.e, abegVar.a.c());
        abefVar.c = commerceActionCommandOuterClass$CommerceActionCommand.d;
        abefVar.b = commerceActionCommandOuterClass$CommerceActionCommand.c;
        abefVar.j(apzgVar.c);
        aopu<String> aopuVar = commerceActionCommandOuterClass$CommerceActionCommand.e;
        aagh c2 = this.g.c();
        for (String str : aopuVar) {
            if (c2.f(str).W() != null && (c = ((aajj) c2.f(str).W()).c()) != null) {
                abefVar.a.add(aoob.x(c));
            }
        }
        if ((commerceActionCommandOuterClass$CommerceActionCommand.b & 4) != 0) {
            aafo aafoVar = this.a;
            apzg apzgVar2 = commerceActionCommandOuterClass$CommerceActionCommand.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar.a(apzgVar2);
        }
        ylx.k(this.f.b.b(abefVar, this.h), this.h, new ylv() { // from class: yfq
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                yfs yfsVar = yfs.this;
                CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand2 = commerceActionCommandOuterClass$CommerceActionCommand;
                if (yfsVar.c.isAdded()) {
                    yfsVar.c.dismiss();
                }
                if ((commerceActionCommandOuterClass$CommerceActionCommand2.b & 8) == 0) {
                    yfsVar.b.e(th);
                    return;
                }
                aafo aafoVar2 = yfsVar.a;
                apzg apzgVar3 = commerceActionCommandOuterClass$CommerceActionCommand2.g;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar2.a(apzgVar3);
            }
        }, new ylw() { // from class: yfr
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                yfs yfsVar = yfs.this;
                aroj arojVar = (aroj) obj;
                if (yfsVar.c.isAdded()) {
                    yfsVar.c.dismiss();
                }
                if ((arojVar.b & 2) != 0) {
                    aafo aafoVar2 = yfsVar.a;
                    apzg apzgVar3 = arojVar.d;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    aafoVar2.a(apzgVar3);
                }
                if ((arojVar.b & 8) != 0) {
                    yfsVar.d.oi().D(new acte(arojVar.e));
                }
            }
        });
    }
}
