package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: aaqs  reason: default package */
/* loaded from: classes.dex */
public abstract class aaqs extends aapd {
    public aaqs(String str, aaqf aaqfVar) {
        this(str, aaqfVar, afvl.a);
    }

    public abstract aoqt a();

    public aaqs(String str, aaqf aaqfVar, afvm afvmVar) {
        this(str, aaqfVar, afvmVar, 1);
    }

    public aaqs(String str, aaqf aaqfVar, afvm afvmVar, int i) {
        this(str, aaqfVar, afvmVar, i, false);
    }

    public aaqs(String str, aaqf aaqfVar, afvm afvmVar, Optional optional) {
        super(str, aaqfVar, afvmVar, 3, false, optional, null, null);
    }

    @Deprecated
    public aaqs(String str, aaqf aaqfVar, afvm afvmVar, int i, boolean z) {
        this(str, aaqfVar, afvmVar, i, z, null, null);
    }

    @Deprecated
    public aaqs(String str, aaqf aaqfVar, afvm afvmVar, int i, boolean z, String str2, Boolean bool) {
        super(str, aaqfVar, afvmVar, i, z, Optional.empty(), str2, bool);
    }
}
