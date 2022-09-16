package com.google.android.libraries.youtube.infocards.factories;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class InfoCardCollection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xcg(17);
    public final arit a;
    private List b;

    public InfoCardCollection(arit aritVar) {
        aritVar.getClass();
        this.a = aritVar;
    }

    public final CharSequence a() {
        arag aragVar;
        arit aritVar = this.a;
        if ((aritVar.b & 4) != 0) {
            aragVar = aritVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
            for (ariy ariyVar : this.a.c) {
                arix arixVar = ariyVar.b;
                if (arixVar == null) {
                    arixVar = arix.a;
                }
                this.b.add(new zza(arixVar));
            }
        }
        return this.b;
    }

    public final byte[] c() {
        arir arirVar = this.a.i;
        if (arirVar == null) {
            arirVar = arir.a;
        }
        if ((arirVar.b & 2) != 0) {
            arir arirVar2 = this.a.i;
            if (arirVar2 == null) {
                arirVar2 = arir.a;
            }
            ariw ariwVar = arirVar2.c;
            if (ariwVar == null) {
                ariwVar = ariw.a;
            }
            return ariwVar.b.I();
        }
        return null;
    }

    public final byte[] d() {
        arir arirVar = this.a.h;
        if (arirVar == null) {
            arirVar = arir.a;
        }
        if ((arirVar.b & 2) != 0) {
            arir arirVar2 = this.a.h;
            if (arirVar2 == null) {
                arirVar2 = arir.a;
            }
            ariw ariwVar = arirVar2.c;
            if (ariwVar == null) {
                ariwVar = ariw.a;
            }
            return ariwVar.b.I();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aphq.l(parcel, this.a);
    }
}
