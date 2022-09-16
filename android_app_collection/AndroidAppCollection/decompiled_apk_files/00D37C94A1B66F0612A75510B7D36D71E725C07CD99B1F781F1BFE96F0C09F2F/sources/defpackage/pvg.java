package defpackage;

import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: pvg  reason: default package */
/* loaded from: classes4.dex */
public final class pvg extends puw {
    private final int d;
    private final Object e;

    public pvg(TrackGroup trackGroup) {
        this(trackGroup, 0);
    }

    @Override // defpackage.pvf
    public final int b() {
        return 0;
    }

    @Override // defpackage.pvf
    public final int c() {
        return this.d;
    }

    @Override // defpackage.pvf
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.pvf
    public final void i(long j, long j2, long j3, List list, psd[] psdVarArr) {
    }

    public pvg(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    public pvg(TrackGroup trackGroup, int i, int i2, Object obj) {
        super(trackGroup, new int[]{i}, null);
        this.d = i2;
        this.e = obj;
    }
}
