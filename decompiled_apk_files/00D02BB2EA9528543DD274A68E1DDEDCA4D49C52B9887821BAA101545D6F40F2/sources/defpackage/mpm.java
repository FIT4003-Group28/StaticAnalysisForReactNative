package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: mpm  reason: default package */
/* loaded from: classes7.dex */
public class mpm implements mov {
    private final Context a;
    private final CharSequence b;
    private final cjtd c;
    @dzsi
    private final Runnable d;

    public mpm(Context context, CharSequence charSequence, cjtd cjtdVar, @dzsi Runnable runnable) {
        this.a = context;
        dbsk.s(charSequence);
        this.b = charSequence;
        this.c = cjtdVar;
        this.d = runnable;
    }

    @Override // defpackage.mov
    public cqsn a() {
        return cqsk.a(String.format(this.a.getString(R.string.CAR_PLACE_DETAILS_PARENT_POI), alp.a().c(this.b)));
    }

    @Override // defpackage.mov
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.mov
    public Boolean c() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.mov
    public cqkl d() {
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    public int hashCode() {
        return Objects.hashCode("ParentLinkViewModelImpl");
    }
}
