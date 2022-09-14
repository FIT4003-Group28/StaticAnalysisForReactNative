package com.google.android.apps.gmm.locationsharing.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PersonId implements Serializable, Comparable<PersonId>, Parcelable {
    public final String b;
    public final ahwj c;
    public static final PersonId a = c("0111001101100001011011100111010001100001");
    public static final Parcelable.Creator<PersonId> CREATOR = new ahwi();

    public PersonId(String str, ahwj ahwjVar) {
        this.b = str;
        this.c = ahwjVar;
    }

    public static PersonId a(doep doepVar) {
        dqyj dqyjVar = doepVar.c;
        if (dqyjVar == null) {
            dqyjVar = dqyj.f;
        }
        return c(dqyjVar.b);
    }

    @dzsi
    public static PersonId b(dqzv dqzvVar) {
        dqya dqyaVar;
        int i = dqzvVar.b;
        if (i == 1) {
            return c(((dqyj) dqzvVar.c).b);
        }
        if (i != 2) {
            return null;
        }
        dqyb dqybVar = (dqyb) dqzvVar.c;
        if (dqybVar.b == 6) {
            dqyaVar = (dqya) dqybVar.c;
        } else {
            dqyaVar = dqya.e;
        }
        int i2 = dqyaVar.a;
        if ((i2 & 2) != 0) {
            return e(dqyaVar.c);
        }
        if ((i2 & 4) != 0) {
            return d(dqyaVar.d);
        }
        int i3 = dqybVar.a;
        if ((i3 & 32) != 0) {
            return e(dqybVar.g);
        }
        if ((i3 & 64) != 0) {
            return d(dqybVar.h);
        }
        if ((i3 & 2) == 0) {
            return null;
        }
        return new PersonId(dqybVar.e, ahwj.TOKEN);
    }

    public static PersonId c(String str) {
        if ("0111001101100001011011100111010001100001".equals(str)) {
            return new PersonId(str, ahwj.SANTA);
        }
        return new PersonId(str, ahwj.GAIA);
    }

    public static PersonId d(String str) {
        return new PersonId(str, ahwj.PHONE);
    }

    public static PersonId e(String str) {
        return new PersonId(str, ahwj.EMAIL);
    }

    @dzsi
    public static PersonId j(ajja ajjaVar) {
        ahwj ahwjVar;
        ahwj ahwjVar2 = ahwj.GAIA;
        int a2 = ajiz.a(ajjaVar.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            ahwjVar = ahwj.GAIA;
        } else if (i == 2) {
            ahwjVar = ahwj.PHONE;
        } else if (i == 3) {
            ahwjVar = ahwj.EMAIL;
        } else if (i == 4) {
            ahwjVar = ahwj.TOKEN;
        } else if (i != 5) {
            return null;
        } else {
            ahwjVar = ahwj.SANTA;
        }
        return new PersonId(ajjaVar.b, ahwjVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof PersonId)) {
            return false;
        }
        PersonId personId = (PersonId) obj;
        return this.b.equals(personId.b) && this.c.equals(personId.c);
    }

    @dzsi
    public final Uri f() {
        ahwj ahwjVar = ahwj.GAIA;
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            String valueOf = String.valueOf(this.b);
            return Uri.parse(valueOf.length() != 0 ? "tel:".concat(valueOf) : new String("tel:"));
        } else if (ordinal != 2) {
            return null;
        } else {
            String valueOf2 = String.valueOf(this.b);
            return Uri.parse(valueOf2.length() != 0 ? "mailto:".concat(valueOf2) : new String("mailto:"));
        }
    }

    public final String g() {
        dbsk.m(this.c == ahwj.GAIA, "Trying to get Gaia ID of non-Gaia instance.");
        return this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(PersonId personId) {
        return dbzx.b.a(this.c, personId.c).a(this.b, personId.b).i();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final ajja i() {
        ajix bZ = ajja.d.bZ();
        String str = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ajja ajjaVar = (ajja) bZ.b;
        str.getClass();
        ajjaVar.a |= 1;
        ajjaVar.b = str;
        ahwj ahwjVar = ahwj.GAIA;
        int ordinal = this.c.ordinal();
        if (ordinal == 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ajja ajjaVar2 = (ajja) bZ.b;
            ajjaVar2.c = 1;
            ajjaVar2.a = 2 | ajjaVar2.a;
        } else if (ordinal == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ajja ajjaVar3 = (ajja) bZ.b;
            ajjaVar3.c = 2;
            ajjaVar3.a = 2 | ajjaVar3.a;
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ajja ajjaVar4 = (ajja) bZ.b;
            ajjaVar4.c = 3;
            ajjaVar4.a = 2 | ajjaVar4.a;
        } else if (ordinal == 3) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ajja ajjaVar5 = (ajja) bZ.b;
            ajjaVar5.c = 4;
            ajjaVar5.a = 2 | ajjaVar5.a;
        } else if (ordinal == 4) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ajja ajjaVar6 = (ajja) bZ.b;
            ajjaVar6.c = 5;
            ajjaVar6.a = 2 | ajjaVar6.a;
        }
        return bZ.bK();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("id", this.b);
        b.b("type", this.c);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
