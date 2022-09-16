package com.google.android.libraries.youtube.logging.interaction;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class GelVisibilityUpdate implements Parcelable {
    public static final amuk a = amuk.q();
    public final actf b;
    public final amuk c;
    public final awbs d;
    public final asjj e;
    public final int f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class HiddenVisibilityUpdate extends GelVisibilityUpdate {
        public static final Parcelable.Creator CREATOR = new abjw(7);

        public HiddenVisibilityUpdate(Parcel parcel) {
            super(parcel);
        }

        @Override // com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return 0;
        }

        public HiddenVisibilityUpdate(actf actfVar, amuk amukVar, awbs awbsVar) {
            super(actfVar, actfVar.a(), amukVar, awbsVar, (asjj) null);
        }

        public HiddenVisibilityUpdate(acum acumVar, asjj asjjVar) {
            super(new actf(acumVar.b), new actf(acumVar.b).a(), amuk.o(new aops(acumVar.b.g, asvv.a)), acumVar.a, asjjVar);
        }

        public HiddenVisibilityUpdate(awbs awbsVar, asjj asjjVar) {
            super(9, awbsVar, GelVisibilityUpdate.a, asjjVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ShownVisibilityUpdate extends GelVisibilityUpdate {
        public static final Parcelable.Creator CREATOR = new abjw(8);

        public ShownVisibilityUpdate(Parcel parcel) {
            super(parcel);
        }

        @Override // com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return 0;
        }

        public ShownVisibilityUpdate(actf actfVar, amuk amukVar, aoob aoobVar, asjj asjjVar) {
            super(actfVar, actfVar.b(), amukVar, aoobVar, asjjVar);
        }

        public ShownVisibilityUpdate(actf actfVar, amuk amukVar, awbs awbsVar) {
            super(actfVar, actfVar.b(), amukVar, awbsVar, (asjj) null);
        }

        public ShownVisibilityUpdate(acum acumVar, asjj asjjVar) {
            super(new actf(acumVar.b), new actf(acumVar.b).b(), amuk.o(new aops(acumVar.b.g, asvv.a)), acumVar.a, asjjVar);
        }

        public ShownVisibilityUpdate(awbs awbsVar, amuk amukVar, asjj asjjVar) {
            super(2, awbsVar, amukVar, asjjVar);
        }
    }

    public GelVisibilityUpdate(actf actfVar, int i, amuk amukVar, awbs awbsVar, asjj asjjVar) {
        this.b = actfVar;
        this.f = i;
        this.c = amukVar;
        this.d = awbsVar;
        this.e = asjjVar;
    }

    public GelVisibilityUpdate(Parcel parcel) {
        this.b = new actf(parcel.readLong());
        int D = akzj.D(parcel.readInt());
        this.f = D == 0 ? 1 : D;
        this.d = (awbs) zgd.J(parcel, awbs.a);
        Bundle readBundle = parcel.readBundle(asjj.class.getClassLoader());
        asjj asjjVar = null;
        if (readBundle != null && readBundle.containsKey("INTERACTION_LOGGING_CLIENT_DATA_KEY")) {
            try {
                asjjVar = (asjj) aphq.i(readBundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", asjj.a, aoos.b());
            } catch (aopx e) {
                afus.c(2, 12, "Exception reading the InteractionLoggingClientData from Parcel.", e);
            }
        }
        this.e = asjjVar;
        int[] createIntArray = parcel.createIntArray();
        amuf amufVar = new amuf();
        for (int i : createIntArray) {
            amufVar.h(aswa.b(i));
        }
        this.c = amufVar.g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b.a);
        parcel.writeInt(this.f - 1);
        zgd.K(this.d, parcel);
        Bundle bundle = new Bundle();
        asjj asjjVar = this.e;
        if (asjjVar != null) {
            aphq.m(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", asjjVar);
        }
        parcel.writeBundle(bundle);
        int[] iArr = new int[this.c.size()];
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            iArr[i2] = ((aswa) this.c.get(i2)).d;
        }
        parcel.writeIntArray(iArr);
    }

    public GelVisibilityUpdate(actf actfVar, int i, amuk amukVar, aoob aoobVar, asjj asjjVar) {
        this.b = actfVar;
        this.f = i;
        this.c = amukVar;
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        aoobVar.getClass();
        awbsVar.b |= 1;
        awbsVar.c = aoobVar;
        this.d = (awbs) createBuilder.mo39build();
        this.e = asjjVar;
    }

    public GelVisibilityUpdate(int i, awbs awbsVar, amuk amukVar, asjj asjjVar) {
        this.b = new actf(i - 1);
        this.f = i;
        this.d = actm.a(awbsVar);
        this.c = amukVar;
        this.e = asjjVar;
    }
}
