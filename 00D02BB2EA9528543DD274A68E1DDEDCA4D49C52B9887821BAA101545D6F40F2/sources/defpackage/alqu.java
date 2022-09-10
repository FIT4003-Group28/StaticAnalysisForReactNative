package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqu  reason: default package */
/* loaded from: classes.dex */
public final class alqu implements dbty<akzh> {
    final /* synthetic */ alrc a;

    public alqu(alrc alrcVar) {
        this.a = alrcVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ akzh a() {
        alrc alrcVar = this.a;
        DisplayMetrics displayMetrics = alrcVar.o.getDisplayMetrics();
        akpe a = alrcVar.i.a();
        final bnsn a2 = alrcVar.j.a();
        akyy akyyVar = new akyy(displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (alrcVar.o.getDisplayMetrics().widthPixels <= 0 || alrcVar.o.getDisplayMetrics().heightPixels <= 0) {
            String format = String.format("Resources.size=%sx%s; ActivityContext.Resources.size=%sx%s; ApplicationContext.Resources.size=%sx%s", Integer.valueOf(alrcVar.o.getDisplayMetrics().widthPixels), Integer.valueOf(alrcVar.o.getDisplayMetrics().heightPixels), Integer.valueOf(alrcVar.e.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(alrcVar.e.getResources().getDisplayMetrics().heightPixels), Integer.valueOf(alrcVar.b.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(alrcVar.b.getResources().getDisplayMetrics().heightPixels));
            Context context = alrcVar.e;
            while (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                String valueOf = String.valueOf(format);
                String valueOf2 = String.valueOf(String.format("; ActivityContext.base.Resources.size=%s.%s", Integer.valueOf(context.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels)));
                format = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            throw new IllegalStateException(format);
        }
        alad a3 = a.a();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        a2.getClass();
        akzh akzhVar = new akzh(a3, i, i2, f, new Runnable(a2) { // from class: alqq
            private final bnsn a;

            {
                this.a = a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.q();
            }
        }, alrcVar.q, akyyVar);
        akzhVar.i = true;
        return akzhVar;
    }
}
