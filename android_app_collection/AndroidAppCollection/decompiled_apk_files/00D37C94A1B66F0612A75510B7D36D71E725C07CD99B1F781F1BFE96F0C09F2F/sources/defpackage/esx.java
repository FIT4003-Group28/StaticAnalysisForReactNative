package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esx  reason: default package */
/* loaded from: classes3.dex */
public final class esx extends etb {
    final /* synthetic */ etd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esx(etd etdVar, etc etcVar) {
        super(etdVar, etcVar);
        this.a = etdVar;
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return BrowseResponseModel.e(bArr, this.a.f);
    }

    @Override // defpackage.etb
    protected final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((BrowseResponseModel) obj).k();
    }
}
