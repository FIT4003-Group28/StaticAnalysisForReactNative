package defpackage;

import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: coog  reason: default package */
/* loaded from: classes5.dex */
final class coog implements Comparator<PlaceLikelihoodEntity> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(PlaceLikelihoodEntity placeLikelihoodEntity, PlaceLikelihoodEntity placeLikelihoodEntity2) {
        return -Float.compare(placeLikelihoodEntity.b, placeLikelihoodEntity2.b);
    }
}
