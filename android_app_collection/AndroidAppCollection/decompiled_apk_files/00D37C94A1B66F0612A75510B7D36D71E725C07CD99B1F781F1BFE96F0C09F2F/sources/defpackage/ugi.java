package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ugi  reason: default package */
/* loaded from: classes4.dex */
public final class ugi implements ufv {
    private final Context a;
    private final ufl b;

    public ugi(Context context, ufl uflVar) {
        this.a = context;
        this.b = uflVar;
    }

    private static long d(Context context) {
        long j = -1;
        try {
            long h = rxn.h(context.getContentResolver(), -1L);
            if (h != -1) {
                return h;
            }
            try {
                uev.b("TargetCreatorHelperImpl", "Failed to get android ID.", new Object[0]);
                return h;
            } catch (SecurityException e) {
                e = e;
                j = h;
                uev.c("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new Object[0]);
                return j;
            }
        } catch (SecurityException e2) {
            e = e2;
        }
    }

    private static long e(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
    }

    @Override // defpackage.ufv
    public final aojv a() {
        aopa createBuilder = aojv.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aojv aojvVar = (aojv) createBuilder.instance;
        packageName.getClass();
        aojvVar.b |= 4;
        aojvVar.e = packageName;
        aopa createBuilder2 = aoje.a.createBuilder();
        String packageName2 = this.a.getApplicationContext().getPackageName();
        createBuilder2.copyOnWrite();
        aoje aojeVar = (aoje) createBuilder2.instance;
        packageName2.getClass();
        aojeVar.b |= 8;
        aojeVar.e = packageName2;
        String a = this.b.a();
        if (!TextUtils.isEmpty(a)) {
            createBuilder2.copyOnWrite();
            aoje aojeVar2 = (aoje) createBuilder2.instance;
            a.getClass();
            aojeVar2.b |= 1;
            aojeVar2.c = a;
        }
        long d = d(this.a);
        if (d != -1) {
            createBuilder2.copyOnWrite();
            aoje aojeVar3 = (aoje) createBuilder2.instance;
            aojeVar3.b |= 4;
            aojeVar3.d = d;
        }
        long e = e(this.a);
        if (e != -1) {
            createBuilder2.copyOnWrite();
            aoje aojeVar4 = (aoje) createBuilder2.instance;
            aojeVar4.b |= 16;
            aojeVar4.f = e;
        }
        aopa createBuilder3 = aoju.a.createBuilder();
        createBuilder3.copyOnWrite();
        aoju aojuVar = (aoju) createBuilder3.instance;
        aojuVar.c = 3;
        aojuVar.b |= 1;
        aopa createBuilder4 = aoja.a.createBuilder();
        aoje aojeVar5 = (aoje) createBuilder2.mo39build();
        createBuilder4.copyOnWrite();
        aoja aojaVar = (aoja) createBuilder4.instance;
        aojeVar5.getClass();
        aojaVar.c = aojeVar5;
        aojaVar.b = 2;
        aoja aojaVar2 = (aoja) createBuilder4.mo39build();
        createBuilder3.copyOnWrite();
        aoju aojuVar2 = (aoju) createBuilder3.instance;
        aojaVar2.getClass();
        aojuVar2.d = aojaVar2;
        aojuVar2.b = 2 | aojuVar2.b;
        aoju aojuVar3 = (aoju) createBuilder3.mo39build();
        createBuilder.copyOnWrite();
        aojv aojvVar2 = (aojv) createBuilder.instance;
        aojuVar3.getClass();
        aojvVar2.d = aojuVar3;
        aojvVar2.c = 1;
        return (aojv) createBuilder.mo39build();
    }

    @Override // defpackage.ufv
    public final aolo b() {
        aopa createBuilder = aokj.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aokj aokjVar = (aokj) createBuilder.instance;
        packageName.getClass();
        aokjVar.b |= 8;
        aokjVar.e = packageName;
        String b = this.b.b();
        createBuilder.copyOnWrite();
        aokj aokjVar2 = (aokj) createBuilder.instance;
        b.getClass();
        aokjVar2.b |= 1;
        aokjVar2.c = b;
        long d = d(this.a);
        if (d != -1) {
            createBuilder.copyOnWrite();
            aokj aokjVar3 = (aokj) createBuilder.instance;
            aokjVar3.b |= 4;
            aokjVar3.d = d;
        }
        long e = e(this.a);
        if (e != -1) {
            createBuilder.copyOnWrite();
            aokj aokjVar4 = (aokj) createBuilder.instance;
            aokjVar4.b |= 16;
            aokjVar4.f = e;
        }
        aopa createBuilder2 = aolo.a.createBuilder();
        createBuilder2.copyOnWrite();
        aolo aoloVar = (aolo) createBuilder2.instance;
        aoloVar.c = 3;
        aoloVar.b |= 1;
        aopa createBuilder3 = aokg.a.createBuilder();
        aokj aokjVar5 = (aokj) createBuilder.mo39build();
        createBuilder3.copyOnWrite();
        aokg aokgVar = (aokg) createBuilder3.instance;
        aokjVar5.getClass();
        aokgVar.c = aokjVar5;
        aokgVar.b = 1;
        aokg aokgVar2 = (aokg) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        aolo aoloVar2 = (aolo) createBuilder2.instance;
        aokgVar2.getClass();
        aoloVar2.d = aokgVar2;
        aoloVar2.b |= 2;
        return (aolo) createBuilder2.mo39build();
    }

    @Override // defpackage.ufv
    public final aolp c() {
        aopa createBuilder = aolp.a.createBuilder();
        String packageName = this.a.getApplicationContext().getPackageName();
        createBuilder.copyOnWrite();
        aolp aolpVar = (aolp) createBuilder.instance;
        packageName.getClass();
        aolpVar.b |= 4;
        aolpVar.e = packageName;
        aolo b = b();
        createBuilder.copyOnWrite();
        aolp aolpVar2 = (aolp) createBuilder.instance;
        b.getClass();
        aolpVar2.d = b;
        aolpVar2.c = 1;
        return (aolp) createBuilder.mo39build();
    }
}
