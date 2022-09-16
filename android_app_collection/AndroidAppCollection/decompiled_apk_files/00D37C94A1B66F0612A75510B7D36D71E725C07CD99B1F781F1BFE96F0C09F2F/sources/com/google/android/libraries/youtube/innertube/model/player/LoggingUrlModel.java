package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LoggingUrlModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aalf(15);
    public final String a;
    private final Set b;

    public LoggingUrlModel(ors orsVar) {
        this.a = (orsVar.b & 1) != 0 ? orsVar.c : "";
        aqxo.i(new aaob(this));
        this.b = new HashSet();
        for (Integer num : orsVar.d) {
            aswe b = aswe.b(num.intValue());
            if (b != null) {
                this.b.add(b);
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((LoggingUrlModel) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aopa createBuilder = ors.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ors orsVar = (ors) createBuilder.instance;
        str.getClass();
        orsVar.b |= 1;
        orsVar.c = str;
        for (aswe asweVar : this.b) {
            int i2 = asweVar.g;
            createBuilder.copyOnWrite();
            ors orsVar2 = (ors) createBuilder.instance;
            aopq aopqVar = orsVar2.d;
            if (!aopqVar.c()) {
                orsVar2.d = aopi.mutableCopy(aopqVar);
            }
            orsVar2.d.g(i2);
        }
        zgd.K((ors) createBuilder.mo39build(), parcel);
    }

    public LoggingUrlModel(aswg aswgVar) {
        aqxo.y(1 == (aswgVar.b & 1));
        this.a = aswgVar.c;
        aqxo.i(new aaob(this, 1));
        this.b = new HashSet();
        if (aswgVar.d.size() != 0) {
            for (aswf aswfVar : aswgVar.d) {
                Set set = this.b;
                aswe b = aswe.b(aswfVar.c);
                if (b == null) {
                    b = aswe.UNKNOWN;
                }
                set.add(b);
            }
        }
    }
}
