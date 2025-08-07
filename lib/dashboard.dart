import 'package:flutter/material.dart';

class DashboardPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('FWS Dashboard'),
        centerTitle: true,
      ),
      body: Center(
        child: Text(
          'Bienvenido al panel principal de Fusion Welding Solution',
          style: Theme.of(context).textTheme.headlineSmall,
          textAlign: TextAlign.center,
        ),
      ),
    );
  }
}
