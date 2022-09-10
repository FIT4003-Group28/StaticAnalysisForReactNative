package defpackage;

import android.os.Parcel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: czr  reason: default package */
/* loaded from: classes5.dex */
public final class czr {
    public static final dcdn<czq, String> a(Parcel parcel) {
        dcdg p = dcdn.p();
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            czq b = czq.e.b(parcel.readInt());
            dbsk.s(b);
            String readString = parcel.readString();
            dbsk.s(readString);
            p.f(b, readString);
        }
        return p.b();
    }

    public static final void b(dcdn<czq, String> dcdnVar, Parcel parcel) {
        parcel.writeInt(dcdnVar.size());
        dcpd<Map.Entry<czq, String>> it = dcdnVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<czq, String> next = it.next();
            parcel.writeInt(next.getKey().d);
            parcel.writeString(next.getValue());
        }
    }
}
