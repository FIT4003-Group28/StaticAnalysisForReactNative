package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afyb  reason: default package */
/* loaded from: classes.dex */
public final class afyb implements afxq {
    private final Context a;
    private final afvy b;

    public afyb(Context context, afsu afsuVar, afvy afvyVar) {
        context.getClass();
        this.a = context;
        afsuVar.getClass();
        afvyVar.getClass();
        this.b = afvyVar;
    }

    @Override // defpackage.afxq
    public final aswe a() {
        return aswe.USER_AUTH;
    }

    @Override // defpackage.afxq
    public final void b(Map map, afye afyeVar) {
        aqxo.y(zgt.m(afyeVar.g()));
        if (afyeVar.e().z()) {
            return;
        }
        afvm e = afyeVar.e();
        afvv a = this.b.a(e).a(e);
        if (a.g()) {
            Pair b = a.b();
            map.put((String) b.first, (String) b.second);
        } else if (a.f()) {
            throw new ceq(a.a());
        } else {
            Exception d = a.d();
            if (!(d instanceof IOException)) {
                throw new ceq(d.getMessage());
            }
            throw new ceq(this.a.getString(R.string.common_error_connection), d);
        }
    }

    @Override // defpackage.afxq
    public final boolean d() {
        return false;
    }
}
