package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qod  reason: default package */
/* loaded from: classes4.dex */
public abstract class qod extends BasePendingResult {
    private qpz a;
    public final boolean c;
    final /* synthetic */ qoh d;

    public qod(qoh qohVar) {
        this(qohVar, false);
    }

    public static final qoe d(Status status) {
        return new qoc(status);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return d(status);
    }

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qpz c() {
        if (this.a == null) {
            this.a = new qob(this);
        }
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qod(qoh qohVar, boolean z) {
        super((qsx) null);
        this.d = qohVar;
        this.c = z;
    }
}
