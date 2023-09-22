import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class ActivitiesListComponent {
  
  activities = [
    { type: 'CORRIDA', activity_date: '18/08/2023', distance: 8.0, duration: 42, user: 'Fernando Duarte' },
    { type: 'CORRIDA', activity_date: '16/08/2023', distance: 8.0, duration: 43, user: 'Fernando Duarte' },
    { type: 'CAMINHADA', activity_date: '18/08/2023', distance: 5.0, duration: 55, user: 'Gislaine Rosales' }
  ];
}
