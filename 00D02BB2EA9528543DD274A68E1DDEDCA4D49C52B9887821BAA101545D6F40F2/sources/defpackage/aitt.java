package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aitt  reason: default package */
/* loaded from: classes2.dex */
public class aitt implements aiph {
    private final Context a;
    private final cqat b;
    private final aitz c;
    private aink d;

    public aitt(aink ainkVar, Context context, cqat cqatVar, aitz aitzVar) {
        this.d = ainkVar;
        this.b = cqatVar;
        this.a = context;
        this.c = aitzVar;
    }

    @Override // defpackage.aiph
    public CharSequence a() {
        dbsg<ahvg> d = this.d.l().d(this.d.m());
        if (!d.a()) {
            return "";
        }
        long b = this.b.b();
        String formatDateTime = DateUtils.formatDateTime(this.a, b, 2);
        long offset = TimeZone.getDefault().getOffset(b);
        dnol dnolVar = d.b().b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        long j = b - (offset - dnolVar.f);
        boolean equals = DateUtils.formatDateTime(this.a, j, 2).equals(formatDateTime);
        int i = 1;
        if (true != equals) {
            i = 3;
        }
        return DateUtils.formatDateTime(this.a, j, DateFormat.is24HourFormat(this.a) ? i | 128 : i | 64);
    }

    @Override // defpackage.aiph
    public CharSequence b() {
        dbsg<ahvg> d = this.d.l().d(this.d.m());
        if (!d.a()) {
            return "";
        }
        long b = this.b.b();
        String formatDateTime = DateUtils.formatDateTime(this.a, b, 2);
        long offset = TimeZone.getDefault().getOffset(b);
        dnol dnolVar = d.b().b().d;
        if (dnolVar == null) {
            dnolVar = dnol.g;
        }
        long j = b - (offset - dnolVar.f);
        String formatDateTime2 = DateUtils.formatDateTime(this.a, j, 2);
        String formatDateTime3 = DateUtils.formatDateTime(this.a, j, true != DateFormat.is24HourFormat(this.a) ? 65 : 129);
        if (formatDateTime2.equals(formatDateTime)) {
            return ajsb.a(this.a.getResources(), alp.a(), R.string.SHARER_FORMATTED_TIMEZONE_SAME_DAY_ACCESSIBILITY_TEXT, ((dbsg) this.d.a().h(aitr.a).b()).c(""), formatDateTime3);
        }
        return ajsb.a(this.a.getResources(), alp.a(), R.string.SHARER_FORMATTED_TIMEZONE_DIFFERENT_DAY_ACCESSIBILITY_TEXT, ((dbsg) this.d.a().h(aits.a).b()).c(""), formatDateTime3, formatDateTime2);
    }

    public void c(aink ainkVar) {
        if (!this.d.equals(ainkVar)) {
            this.d = ainkVar;
            cqkx.p(this);
        }
    }
}
