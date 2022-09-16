package defpackage;

import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.research.xeno.effect.Effect;
/* compiled from: PG */
/* renamed from: awwj  reason: default package */
/* loaded from: classes2.dex */
public final class awwj implements Effect.NativeLoadCallback {
    final /* synthetic */ ztg a;

    public awwj(ztg ztgVar) {
        this.a = ztgVar;
    }

    @Override // com.google.research.xeno.effect.Effect.NativeLoadCallback
    public final void onCompletion(long j, String str) {
        Effect effect = j != 0 ? new Effect(j) : null;
        ztg ztgVar = this.a;
        ztl ztlVar = ztgVar.a;
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = ztgVar.b;
        String str2 = ztgVar.c;
        if (effect == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(str).length());
            sb.append("Error creating Effect ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            zep.b(sb.toString());
            return;
        }
        ztlVar.l.b++;
        ztlVar.e();
        filterMapTable$FilterDescriptor.e = effect.c;
        filterMapTable$FilterDescriptor.d();
        ztlVar.h.put(akzj.h(filterMapTable$FilterDescriptor.a), effect);
        synchronized (ztlVar.j) {
            zrh zrhVar = ztlVar.k;
            if (zrhVar != null) {
                zrhVar.b();
            }
        }
    }
}
