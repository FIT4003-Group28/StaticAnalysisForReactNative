package defpackage;
/* compiled from: PG */
/* renamed from: usi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class usi implements amqo {
    public final /* synthetic */ usj a;
    private final /* synthetic */ int b;

    public /* synthetic */ usi(usj usjVar) {
        this.a = usjVar;
    }

    public /* synthetic */ usi(usj usjVar, int i) {
        this.b = i;
        this.a = usjVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            vpg e = this.a.a.e("client_streamz/youtube/parent_tools_mobile/web_app_loaded", vpf.c("host_name"), vpf.c("host_version"), vpf.c("use_case"));
            e.c();
            return e;
        } else if (i == 1) {
            vpg e2 = this.a.a.e("client_streamz/youtube/parent_tools_mobile/parent_tools_started", vpf.c("host_name"), vpf.c("host_version"), vpf.c("use_case"));
            e2.c();
            return e2;
        } else if (i == 2) {
            vpg e3 = this.a.a.e("client_streamz/youtube/parent_tools_mobile/parent_tools_closed", vpf.c("onboarding_state"), vpf.c("close_reason"), vpf.c("host_name"), vpf.c("host_version"), vpf.c("use_case"));
            e3.c();
            return e3;
        } else {
            vpg e4 = this.a.a.e("client_streamz/youtube/parent_tools_mobile/parent_tools_error", vpf.c("error_type"), vpf.c("http_error_code"), vpf.c("host_name"), vpf.c("host_version"), vpf.c("use_case"));
            e4.c();
            return e4;
        }
    }
}
