package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class Answer implements Parcelable {
    public static final Parcelable.Creator<Answer> CREATOR = new czof();
    public duaq a;
    public String b;
    public dubn c;
    public long d;
    public boolean e;
    public String f;
    public int g;

    public Answer() {
        this.a = duaq.d;
        this.g = 1;
        this.b = "";
        this.c = dubn.c;
        this.d = 0L;
        this.e = false;
        this.f = "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeByteArray(this.a.bS());
        int i2 = this.g;
        switch (i2) {
            case 1:
                str = "NOT_SET";
                break;
            case 2:
                str = "SURVEY_SHOWN";
                break;
            case 3:
                str = "SURVEY_ACCEPTED";
                break;
            case 4:
                str = "INVITATION_ANSWERED";
                break;
            case 5:
                str = "QUESTION_ANSWERED";
                break;
            case 6:
                str = "SURVEY_CLOSED";
                break;
            default:
                str = "null";
                break;
        }
        if (i2 != 0) {
            parcel.writeString(str);
            parcel.writeString(this.b);
            parcel.writeByteArray(this.c.bS());
            parcel.writeLong(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f);
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Answer(Parcel parcel) {
        char c;
        duaq duaqVar;
        byte[] createByteArray = parcel.createByteArray();
        if (czov.b(dydx.b(czov.a))) {
            if (createByteArray != null) {
                duaqVar = (duaq) czph.a(duaq.d, createByteArray);
            } else {
                duaqVar = duaq.d;
            }
            this.a = duaqVar;
        } else {
            this.a = (duaq) czph.a(duaq.d, createByteArray);
        }
        String readString = parcel.readString();
        boolean z = false;
        int i = 5;
        switch (readString.hashCode()) {
            case -1446966090:
                if (readString.equals("NOT_SET")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1226895677:
                if (readString.equals("INVITATION_ANSWERED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -904377066:
                if (readString.equals("QUESTION_ANSWERED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -801661455:
                if (readString.equals("SURVEY_CLOSED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -541898004:
                if (readString.equals("SURVEY_ACCEPTED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 127344588:
                if (readString.equals("SURVEY_SHOWN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else if (c == 2) {
            i = 3;
        } else if (c == 3) {
            i = 4;
        } else if (c != 4) {
            if (c != 5) {
                throw new IllegalArgumentException();
            }
            i = 6;
        }
        this.g = i;
        this.b = parcel.readString();
        byte[] createByteArray2 = parcel.createByteArray();
        if (createByteArray2 != null) {
            this.c = (dubn) czph.a(dubn.c, createByteArray2);
        } else {
            this.c = dubn.c;
        }
        this.d = parcel.readLong();
        this.e = parcel.readInt() > 0 ? true : z;
        this.f = parcel.readString();
    }
}
