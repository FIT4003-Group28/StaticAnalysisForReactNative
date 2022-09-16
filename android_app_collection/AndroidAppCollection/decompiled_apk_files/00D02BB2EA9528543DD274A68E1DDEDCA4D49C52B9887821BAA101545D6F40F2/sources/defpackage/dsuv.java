package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
/* compiled from: PG */
/* renamed from: dsuv  reason: default package */
/* loaded from: classes6.dex */
public final class dsuv {
    public static <T extends dssj> T a(Parcel parcel, T t, dsqa dsqaVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        if (Build.VERSION.SDK_INT >= 23) {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR);
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcel.readParcelable(ProtoParsers$InternalDontUse.class.getClassLoader());
        }
        return (T) b(protoParsers$InternalDontUse, t, dsqaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends dssj> T b(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, T t, dsqa dsqaVar) {
        return (T) protoParsers$InternalDontUse.b(t.Qw(), dsqaVar);
    }

    public static <T extends dssj> T c(Bundle bundle, String str, T t, dsqa dsqaVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        try {
            Parcelable parcelable = bundle.getParcelable(str);
            if (parcelable instanceof Bundle) {
                Bundle bundle2 = (Bundle) parcelable;
                bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
            }
            return (T) b(protoParsers$InternalDontUse, t, dsqaVar);
        } catch (dsrm e) {
            throw new RuntimeException(e);
        }
    }

    public static void d(Bundle bundle, String str, dssj dssjVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, dssjVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void e(Parcel parcel, dssj dssjVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, dssjVar), 0);
        } else {
            parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, dssjVar), 0);
        }
    }

    public static <T extends dssj> ProtoParsers$ParcelableProto<T> f(T t) {
        return new ProtoParsers$InternalDontUse(null, t);
    }
}
