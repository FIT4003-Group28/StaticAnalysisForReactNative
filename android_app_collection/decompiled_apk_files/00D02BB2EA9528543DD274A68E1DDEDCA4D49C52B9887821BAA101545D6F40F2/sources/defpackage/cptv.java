package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cptv  reason: default package */
/* loaded from: classes5.dex */
public final class cptv<T, D> implements cptp<T, D> {
    private final cptr a;

    public cptv(Context context) {
        this.a = new cptr(context);
    }

    @Override // defpackage.cptp
    public final View a(List<cpto<T, D>> list) {
        this.a.b.clear();
        this.a.a = null;
        if (list.isEmpty()) {
            return this.a;
        }
        cpto<T, D> cptoVar = list.get(0);
        if (list.size() == 1) {
            this.a.a(cptoVar.b.toString(), cptoVar.c.toString(), cptoVar.d);
        } else {
            this.a.a = cptoVar.b.toString();
            for (cpto<T, D> cptoVar2 : list) {
                this.a.a(cptoVar2.a, cptoVar2.c.toString(), cptoVar2.d);
            }
        }
        return this.a;
    }
}
