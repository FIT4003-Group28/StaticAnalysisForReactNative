package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
/* compiled from: PG */
/* renamed from: rwe  reason: default package */
/* loaded from: classes4.dex */
public final class rwe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = tqj.Q(parcel);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        Barcode.Email email = null;
        Barcode.Phone phone = null;
        Barcode.Sms sms = null;
        Barcode.WiFi wiFi = null;
        Barcode.UrlBookmark urlBookmark = null;
        Barcode.GeoPoint geoPoint = null;
        Barcode.CalendarEvent calendarEvent = null;
        Barcode.ContactInfo contactInfo = null;
        Barcode.DriverLicense driverLicense = null;
        byte[] bArr = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (tqj.M(readInt)) {
                case 2:
                    i = tqj.O(parcel, readInt);
                    break;
                case 3:
                    str = tqj.Y(parcel, readInt);
                    break;
                case 4:
                    str2 = tqj.Y(parcel, readInt);
                    break;
                case 5:
                    i2 = tqj.O(parcel, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) tqj.ai(parcel, readInt, Point.CREATOR);
                    break;
                case 7:
                    email = (Barcode.Email) tqj.U(parcel, readInt, Barcode.Email.CREATOR);
                    break;
                case 8:
                    phone = (Barcode.Phone) tqj.U(parcel, readInt, Barcode.Phone.CREATOR);
                    break;
                case 9:
                    sms = (Barcode.Sms) tqj.U(parcel, readInt, Barcode.Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (Barcode.WiFi) tqj.U(parcel, readInt, Barcode.WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (Barcode.UrlBookmark) tqj.U(parcel, readInt, Barcode.UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (Barcode.GeoPoint) tqj.U(parcel, readInt, Barcode.GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (Barcode.CalendarEvent) tqj.U(parcel, readInt, Barcode.CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (Barcode.ContactInfo) tqj.U(parcel, readInt, Barcode.ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (Barcode.DriverLicense) tqj.U(parcel, readInt, Barcode.DriverLicense.CREATOR);
                    break;
                case 16:
                    bArr = tqj.af(parcel, readInt);
                    break;
                case 17:
                    z = tqj.ae(parcel, readInt);
                    break;
                case 18:
                    d = tqj.K(parcel, readInt);
                    break;
                default:
                    tqj.ad(parcel, readInt);
                    break;
            }
        }
        tqj.ac(parcel, Q);
        return new Barcode(i, str, str2, i2, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense, bArr, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Barcode[i];
    }
}
