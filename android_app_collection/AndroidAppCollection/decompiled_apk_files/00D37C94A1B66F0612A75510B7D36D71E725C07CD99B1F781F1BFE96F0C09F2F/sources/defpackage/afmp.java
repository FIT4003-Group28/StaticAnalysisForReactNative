package defpackage;
/* compiled from: PG */
/* renamed from: afmp  reason: default package */
/* loaded from: classes.dex */
public final class afmp {
    public String a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;

    public afmp(yve yveVar) {
        a((awuj) yveVar.c());
    }

    private final void a(awuj awujVar) {
        this.a = (awujVar.b & 8) != 0 ? awujVar.g : null;
        aoqp aoqpVar = awujVar.h;
        int i = -1;
        this.b = aoqpVar.containsKey("last_manual_video_quality_selection_max") ? ((Integer) aoqpVar.get("last_manual_video_quality_selection_max")).intValue() : -1;
        aoqp aoqpVar2 = awujVar.i;
        if (aoqpVar2.containsKey("last_manual_video_quality_selection_min")) {
            i = ((Integer) aoqpVar2.get("last_manual_video_quality_selection_min")).intValue();
        }
        this.c = i;
        aoqp aoqpVar3 = awujVar.j;
        this.d = aoqpVar3.containsKey("last_manual_video_quality_selection_direction") ? ((Integer) aoqpVar3.get("last_manual_video_quality_selection_direction")).intValue() : -2;
        aoqp aoqpVar4 = awujVar.k;
        long j = -1;
        this.e = aoqpVar4.containsKey("last_manual_video_quality_selection_timestamp") ? ((Long) aoqpVar4.get("last_manual_video_quality_selection_timestamp")).longValue() : -1L;
        aoqp aoqpVar5 = awujVar.d;
        if (aoqpVar5.containsKey("last_playback_start_timestamp")) {
            j = ((Long) aoqpVar5.get("last_playback_start_timestamp")).longValue();
        }
        this.f = j;
    }

    public afmp(yve yveVar, int i) {
        awuj awujVar = (awuj) yveVar.c();
        awuc awucVar = awujVar.u;
        awucVar = awucVar == null ? awuc.a : awucVar;
        awuc awucVar2 = awujVar.t;
        awucVar2 = awucVar2 == null ? awuc.a : awucVar2;
        if ((awucVar.b & 1) != 0) {
            long j = -1;
            if (i != 1 || awucVar.e >= awucVar2.e) {
                this.e = awucVar.e;
            } else {
                this.e = -1L;
                awucVar = awucVar2;
            }
            this.a = (awujVar.b & 8) != 0 ? awujVar.g : null;
            aoqp aoqpVar = awujVar.d;
            this.f = aoqpVar.containsKey("last_playback_start_timestamp") ? ((Long) aoqpVar.get("last_playback_start_timestamp")).longValue() : j;
            int i2 = awucVar.b;
            int i3 = i2 & 1;
            int i4 = -1;
            this.b = i3 != 0 ? awucVar.c : -1;
            this.c = i3 != 0 ? awucVar.c : i4;
            this.d = (i2 & 2) != 0 ? awucVar.d : -2;
            return;
        }
        a(awujVar);
    }
}
