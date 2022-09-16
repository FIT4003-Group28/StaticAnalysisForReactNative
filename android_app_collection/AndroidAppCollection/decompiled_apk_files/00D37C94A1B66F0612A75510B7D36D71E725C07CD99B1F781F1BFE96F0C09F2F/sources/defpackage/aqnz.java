package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqnz  reason: default package */
/* loaded from: classes2.dex */
public final class aqnz implements aajq {
    public static final aajr a = new aqny();
    private final aqoa b;

    public aqnz(aqoa aqoaVar) {
        this.b = aqoaVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amzt listIterator = ((amuk) getFormatsModels()).listIterator();
        while (listIterator.hasNext()) {
            aqnk aqnkVar = (aqnk) listIterator.next();
            amvlVar.j(aqnk.b());
        }
        getSelectedFormatModel();
        amvlVar.j(aqnk.b());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aqnx(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqnz) && this.b.equals(((aqnz) obj).b);
    }

    public aqob getDismissState() {
        aqob b = aqob.b(this.b.g);
        return b == null ? aqob.DOWNLOAD_QUALITY_PICKER_DISMISS_STATE_UNKNOWN : b;
    }

    public List getFormats() {
        return this.b.d;
    }

    public List getFormatsModels() {
        amuf amufVar = new amuf();
        for (aqnl aqnlVar : this.b.d) {
            amufVar.h(aqnk.a(aqnlVar).a());
        }
        return amufVar.g();
    }

    public Boolean getRememberSetting() {
        return Boolean.valueOf(this.b.f);
    }

    public aqnl getSelectedFormat() {
        aqnl aqnlVar = this.b.e;
        return aqnlVar == null ? aqnl.a : aqnlVar;
    }

    public aqnk getSelectedFormatModel() {
        aqnl aqnlVar = this.b.e;
        if (aqnlVar == null) {
            aqnlVar = aqnl.a;
        }
        return aqnk.a(aqnlVar).a();
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DownloadQualityPickerEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
