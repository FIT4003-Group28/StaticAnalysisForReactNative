package defpackage;
/* compiled from: PG */
/* renamed from: ckgm  reason: default package */
/* loaded from: classes4.dex */
public enum ckgm {
    CONFIRM(0),
    MODIFY_START_TIME(1),
    MODIFY_END_TIME(2),
    MODIFY_PLACE(3),
    MODIFY_START_TIME_AND_END_TIME(4),
    MODIFY_START_TIME_AND_PLACE(5),
    MODIFY_END_TIME_AND_PLACE(6),
    MODIFY_START_TIME_AND_END_TIME_AND_PLACE(7),
    MODIFY_OTHER(8),
    OTHER(9),
    CREATE(10),
    CREATE_OTHER(11);
    
    public final int m;

    ckgm(int i) {
        this.m = i;
    }
}
