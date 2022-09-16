package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aexa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aexa implements amqo {
    public final /* synthetic */ afbi a;
    private final /* synthetic */ int b;

    public /* synthetic */ aexa(afbi afbiVar) {
        this.a = afbiVar;
    }

    public /* synthetic */ aexa(afbi afbiVar, int i) {
        this.b = i;
        this.a = afbiVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Boolean.valueOf(this.a.w());
            }
            if (i == 2) {
                return Boolean.valueOf(this.a.w());
            }
            if (i == 3) {
                return Boolean.valueOf(this.a.w());
            }
            if (i != 4) {
                return this.a.a();
            }
            FormatStreamModel formatStreamModel = this.a.m;
            return Integer.valueOf(formatStreamModel == null ? 0 : formatStreamModel.f);
        }
        return this.a.a();
    }
}
