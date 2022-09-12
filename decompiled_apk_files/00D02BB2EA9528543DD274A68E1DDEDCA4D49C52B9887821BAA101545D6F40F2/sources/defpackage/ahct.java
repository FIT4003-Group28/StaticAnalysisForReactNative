package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahct  reason: default package */
/* loaded from: classes2.dex */
public class ahct implements agze {
    private final gga a;
    private final dlay b;

    public ahct(gga ggaVar, dlay dlayVar) {
        this.a = ggaVar;
        this.b = dlayVar;
    }

    @Override // defpackage.agze
    public String a() {
        if (!this.b.d.isEmpty()) {
            return this.a.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_RELATED_EMAIL_HEADER_TEXT, new Object[]{this.b.d});
        }
        if (!this.b.c.isEmpty()) {
            return this.a.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_RELATED_EMAIL_HEADER_TEXT, new Object[]{this.b.c});
        }
        return this.a.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_RELATED_EMAIL_DEFAULT_HEADER_TEXT);
    }

    @Override // defpackage.agze
    public cqkl b() {
        this.a.D(gfk.i(this.b.b, "mail"));
        return cqkl.a;
    }
}
