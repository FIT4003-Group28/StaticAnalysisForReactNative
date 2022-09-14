package com.teslamotors.plugins.calendar;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: CalendarData.java */
/* loaded from: classes.dex */
public class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5278a = "a";
    private HashMap<Integer, C0114a> e;
    private boolean f;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5279b = {"_id", "title", "eventLocation", "allDay", "calendar_color", "organizer", "calendar_id", "eventStatus", "description"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f5280c = {"begin", "end", "event_id"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f5281d = {"_id", "calendar_displayName", "calendar_color"};
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.teslamotors.plugins.calendar.a.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CalendarData.java */
    /* loaded from: classes.dex */
    public class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public long f5286a;

        /* renamed from: b  reason: collision with root package name */
        public String f5287b;

        /* renamed from: c  reason: collision with root package name */
        public long f5288c;

        /* renamed from: d  reason: collision with root package name */
        public long f5289d;
        public boolean e;
        public String f;
        public String g;
        public String h;
        public int i;
        public String j;

        public b(long j, String str, long j2, long j3, boolean z, String str2, String str3, String str4, int i, String str5) {
            this.f5286a = j;
            this.f5287b = str;
            this.f5288c = j2;
            this.f5289d = j3;
            this.e = z;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = i;
            this.j = str5;
        }

        public b(Parcel parcel) {
            this.f5287b = d.d(parcel);
            this.f5288c = d.a(parcel).longValue();
            this.f5289d = d.a(parcel).longValue();
            this.e = d.c(parcel).booleanValue();
            this.f = d.d(parcel);
            this.g = d.d(parcel);
            this.h = d.d(parcel);
            this.i = d.b(parcel).intValue();
            this.f5286a = d.a(parcel).longValue();
            this.j = d.d(parcel);
        }

        void a(Parcel parcel) {
            d.a(parcel, this.f5287b);
            d.a(parcel, Long.valueOf(this.f5288c));
            d.a(parcel, Long.valueOf(this.f5289d));
            d.a(parcel, Boolean.valueOf(this.e));
            d.a(parcel, this.f);
            d.a(parcel, this.g);
            d.a(parcel, this.h);
            d.a(parcel, Integer.valueOf(this.i));
            d.a(parcel, Long.valueOf(this.f5286a));
            d.a(parcel, this.j);
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            boolean z = this.i == 2;
            try {
                jSONObject.put("name", this.f5287b);
                jSONObject.put("start", this.f5288c);
                jSONObject.put("end", this.f5289d);
                jSONObject.put(Kind.LOCATION, this.f);
                jSONObject.put("all_day", this.e);
                jSONObject.put("color", this.g);
                jSONObject.put("organizer", this.h);
                jSONObject.put("cancelled", z);
                jSONObject.put("tentative", false);
                jSONObject.put("description", this.j);
            } catch (Exception e) {
                Log.e(a.f5278a, "CalendarEvent toJSON failure", e);
            }
            return jSONObject;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            if (this.f5288c == bVar.f5288c) {
                return (int) (this.f5286a - bVar.f5286a);
            }
            return (int) (this.f5288c - bVar.f5288c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CalendarData.java */
    /* renamed from: com.teslamotors.plugins.calendar.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0114a implements Comparable<C0114a> {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<b> f5282a;

        /* renamed from: b  reason: collision with root package name */
        public String f5283b;

        /* renamed from: c  reason: collision with root package name */
        public String f5284c;

        /* renamed from: d  reason: collision with root package name */
        public int f5285d;
        private boolean f;

        public C0114a(int i, String str, String str2) {
            this.f5282a = new ArrayList<>();
            this.f5285d = i;
            this.f5283b = str;
            this.f5284c = str2;
            this.f = false;
        }

        public C0114a(Parcel parcel) {
            this.f5282a = new ArrayList<>();
            this.f5285d = d.b(parcel).intValue();
            this.f5283b = d.d(parcel);
            this.f5284c = d.d(parcel);
            int intValue = d.b(parcel).intValue();
            for (int i = 0; i < intValue; i++) {
                this.f5282a.add(new b(parcel));
            }
            this.f = false;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C0114a c0114a) {
            return this.f5285d - c0114a.f5285d;
        }

        public void a(b bVar) {
            this.f5282a.add(bVar);
            this.f = false;
        }

        public void a(Parcel parcel) {
            d.a(parcel, Integer.valueOf(this.f5285d));
            d.a(parcel, this.f5283b);
            d.a(parcel, this.f5284c);
            d.a(parcel, Integer.valueOf(this.f5282a.size()));
            Iterator<b> it = this.f5282a.iterator();
            while (it.hasNext()) {
                it.next().a(parcel);
            }
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f5283b);
                jSONObject.put("color", this.f5284c);
                if (!this.f) {
                    Collections.sort(this.f5282a);
                    this.f = true;
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<b> it = this.f5282a.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().a());
                }
                jSONObject.put("events", jSONArray);
            } catch (Exception e) {
                Log.e(a.f5278a, "Calendar toJSON failure", e);
            }
            return jSONObject;
        }
    }

    public a() {
        this.e = new HashMap<>();
        this.f = false;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public boolean a() {
        return this.f;
    }

    public void a(int i, String str, String str2) {
        this.e.put(Integer.valueOf(i), new C0114a(i, str, str2));
    }

    public void a(int i, long j, String str, long j2, long j3, boolean z, String str2, String str3, String str4, int i2, String str5) {
        if (this.e.containsKey(Integer.valueOf(i))) {
            this.e.get(Integer.valueOf(i)).a(new b(j, str, j2, j3, z, str2, str3, str4, i2, str5));
        }
    }

    public JSONObject b() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.e.values());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C0114a) it.next()).a());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("calendars", jSONArray);
        } catch (Exception e) {
            Log.e(f5278a, "CalendarData toJSON failure", e);
        }
        return jSONObject;
    }

    public a(Parcel parcel) {
        int intValue = d.b(parcel).intValue();
        for (int i = 0; i < intValue; i++) {
            C0114a c0114a = new C0114a(parcel);
            this.e.put(Integer.valueOf(c0114a.f5285d), c0114a);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        d.a(parcel, Integer.valueOf(this.e.size()));
        for (C0114a c0114a : this.e.values()) {
            c0114a.a(parcel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.teslamotors.plugins.calendar.a a(android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.calendar.a.a(android.content.Context):com.teslamotors.plugins.calendar.a");
    }

    static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e) {
            Log.e(f5278a, "Failed to close cursor", e);
        }
    }
}
