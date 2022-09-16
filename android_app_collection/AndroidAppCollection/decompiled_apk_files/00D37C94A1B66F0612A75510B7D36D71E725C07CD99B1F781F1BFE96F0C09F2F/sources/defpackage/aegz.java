package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aegz  reason: default package */
/* loaded from: classes.dex */
public final class aegz implements Comparator {
    private final boolean a;

    public aegz(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        FormatStreamModel formatStreamModel = (FormatStreamModel) obj;
        FormatStreamModel formatStreamModel2 = (FormatStreamModel) obj2;
        if (!this.a) {
            i = formatStreamModel2.f;
            i2 = formatStreamModel.f;
        } else if (formatStreamModel2.d() == formatStreamModel.d()) {
            i = formatStreamModel2.f;
            i2 = formatStreamModel.f;
        } else {
            i = formatStreamModel2.d();
            i2 = formatStreamModel.d();
        }
        return i - i2;
    }
}
