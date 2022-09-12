package defpackage;

import com.google.android.apps.gmm.streetview.model.PanoramaLevel;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bwzn  reason: default package */
/* loaded from: classes4.dex */
public final class bwzn implements Comparator<PanoramaLevel> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(PanoramaLevel panoramaLevel, PanoramaLevel panoramaLevel2) {
        return (int) ((panoramaLevel2.b - panoramaLevel.b) * 1000.0f);
    }
}
