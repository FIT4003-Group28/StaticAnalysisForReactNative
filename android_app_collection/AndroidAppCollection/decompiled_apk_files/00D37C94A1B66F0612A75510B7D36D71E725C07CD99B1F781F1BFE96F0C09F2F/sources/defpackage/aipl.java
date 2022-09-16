package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aipl  reason: default package */
/* loaded from: classes.dex */
public final class aipl implements aeoc {
    private final aipk a;

    public aipl(aipk aipkVar) {
        this.a = aipkVar;
    }

    @Override // defpackage.aeoc
    public final aeof a(FormatStreamModel formatStreamModel) {
        long j = formatStreamModel.j();
        if (formatStreamModel.b == null || ((j <= 0 && j != -1) || this.a == null)) {
            return new aeoa();
        }
        return new aipf(new aeoa(), this.a, formatStreamModel);
    }
}
